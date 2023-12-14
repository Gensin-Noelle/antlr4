; ModuleID = 'moduleTest'
source_filename = "moduleTest"

define i32 @max(i32 %n, i32 %n1) {
entry:
  %compare = icmp sgt i32 %n, %n1
  br i1 %compare, label %then, label %else

then:                                             ; preds = %entry
  br label %merge

else:                                             ; preds = %entry
  br label %merge

merge:                                            ; preds = %else, %then
  %result = phi i32 [ %n, %then ], [ %n1, %else ]
  ret i32 %result
}

define i32 @main() {
entry:
  %a = alloca i32, align 4
  store i32 1, i32* %a, align 4
  %load = load i32, i32* %a, align 4
  %TEMPb = mul i32 %load, 2
  %b = alloca i32, align 4
  store i32 %TEMPb, i32* %b, align 4
  %load1 = load i32, i32* %b, align 4
  %maxResult = call i32 @max(i32 %load, i32 %load1)
  %c = alloca i32, align 4
  store i32 %maxResult, i32* %c, align 4
  %load2 = load i32, i32* %c, align 4
  ret i32 %load2
}
