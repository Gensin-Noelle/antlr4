grammar Genshin;
@header{
    import java.util.*;
}
@members{
    Map<String, Double> memory = new HashMap<>();
    double arith(double l, double r, String op) {
            switch (op) {
                case "+":
                    return l + r;
                case "-":
                    return l - r;
                case "*":
                    return l * r;
                case "/":
                    return l / r;
                default:
                    return Math.pow(l, r);
            }
        }
}

r: (varDecl|functionDecl|stat)* EOF;
type: 'int' | 'float' | 'void';
vars [String typeStr]:
                        ID{System.out.println($ID.text + ":" + $typeStr);}
                        (('='expr)?{if ($expr.text != null){memory.put($ID.text, $expr.val);}}
                        | (','ID{System.out.println($ID.text + ":" + $typeStr);})*);
varDecl:type vars[$type.text](';')?;
functionDecl:type ID '('formalParams?')' block;
block:'{' stat* '}';
stat: block                                                      #FacBlock
      | varDecl                                                  #Var
      | expr ';' {System.out.println($expr.text + "=" + $expr.val);
        }                                                        #Express
      | le = ID '=' re = expr ';' {
        memory.put($le.text, $expr.val);}                        #Assign
      | 'if' '('expr?')' block ('else' block)?                   #IF
      | 'for' '('le = varDecl';'mid = expr';'re = expr')' block  #For
      | 'return'expr?';'                                         #Return
      | 'loop''('INT')''{'expr';''}'{
           int i = 0;
           while (i < $INT.int){
                 System.out.println($expr.text + "=" + $expr.val);
                 i++;
           }
      }                                                          #LOOP
      ;
expr returns [double val]
    :
    ID'('exprList?')'                                      #Call
	|le = expr op = ('*' | '/') re = expr{
	    $val = arith($le.val, $re.val, $op.getText());}    #MultDiv
	|le = expr op = ('+' | '-') re = expr{
        $val= arith($le.val, $re.val, $op.getText());}     #AddSub
	|le = expr op = ('>' | '<') re = expr                  #Logic
	| '(' expr ')' {$val = $expr.val;}                     #Parens
	| ID {$val = memory.get($ID.text);}                    #Id
	| STRING                                               #STR
	| op = '-'?INT{
	 if ($op != null) $val = Double.parseDouble("-" + $INT.text);
         else $val = $INT.int;}                            #Int   //包含负整数
	| op = '-'?FLOAT{
	 if ($op != null) $val = Double.parseDouble("-" + $FLOAT.text);
         else $val = Double.parseDouble($FLOAT.text);}     #Float //包含负浮点数
	|le =  expr '^' re = expr{
	 $val = arith($le.val, $re.val, "^");}                 #Power //幂运算
	;
exprList:expr(','expr)*;
formalParams: formalParam(','formalParam)*;
formalParam: type ID;
STRING:'"'.*?'"';
INT: '0' | [1-9][0-9]*; //定义词法，int型
FLOAT: INT '.' DIGIT* | '.'DIGIT*;
ID: (LETTER | '_' | CHINESE) (LETTER | '_' | DIGIT | CHINESE)*;
WS: [ \t\r\n]+ -> skip;
fragment LETTER: [a-zA-Z];
fragment DIGIT: [0-9];
fragment CHINESE: [\u4e00-\u9fa5];
SL_COMMENT: '//' ~'\n'* '\n' -> skip;
ML_COMMENT: '/*' .*? '*/' ->skip;
DOC_COMMENT: '/**' .*? '*/' ->skip;