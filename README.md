
### 项目简介

这是一个使用 **ANTLR4** 构建的轻量级编译器框架，主要实现了从 **词法分析**、**语法分析**、**语义分析** 到 **中间代码生成** 的完整编译流程。该项目使用 **Java** 编写，支持基本的 **C语言语法结构**，能够处理 **函数嵌套调用**、**if语句和for循环** 等常见语句，并生成类C语言的中间代码。

---

### 项目特点

- **ANTLR4支持**：基于ANTLR4自动生成词法和语法分析器。
- **语法树与监听器模式**：实现了基于语法树的函数调用图及其运算，使用监听器模式隐式遍历语法树。
- **中间代码生成**：支持函数调用、控制语句（如 **if** 和 **for**）的中间代码生成。
- **扩展性**：可以轻松扩展更多的语法功能，并与后端工具对接生成目标代码。

---

### 可能用到的命令行

为了让Clang生成bitcode，可以用下面的命令：

```bash
$ clang sum.c -emit-llvm -c -o sum.bc
```

生成汇编表示的命令：

```bash
$ clang sum.c -emit-llvm -S -c -o sum.ll
```

汇编LLVM IR汇编文本，生成bitcode的命令：

```bash
$ llvm-as sum.ll -o sum.bc
```

将bitcode反向转换为IR汇编，可以使用反汇编器：

```bash
$ llvm-dis sum.bc -o sum.ll
```

使用llc生成汇编代码：

```bash
$ llc sum.bc -o sum.s
```

生成目标代码的命令：

```bash
$ llc sum.bc -filetype=obj -o sum.o
```

### 参考资料

[LLVM Core Libraries中文教程](https://getting-started-with-llvm-core-libraries-zh-cn.readthedocs.io/zh-cn/latest/ch01.html)

