	.text
	.file	"moduleTest"
	.globl	max                             # -- Begin function max
	.p2align	4, 0x90
	.type	max,@function
max:                                    # @max
	.cfi_startproc
# %bb.0:                                # %entry
	movl	%edi, %eax
	cmpl	%esi, %edi
	jg	.LBB0_2
# %bb.1:                                # %else
	movl	%esi, %eax
.LBB0_2:                                # %merge
	retq
.Lfunc_end0:
	.size	max, .Lfunc_end0-max
	.cfi_endproc
                                        # -- End function
	.globl	main                            # -- Begin function main
	.p2align	4, 0x90
	.type	main,@function
main:                                   # @main
	.cfi_startproc
# %bb.0:                                # %entry
	subq	$24, %rsp
	.cfi_def_cfa_offset 32
	movl	$1, 20(%rsp)
	movl	$2, 16(%rsp)
	movl	$1, %edi
	movl	$2, %esi
	callq	max@PLT
	movl	%eax, 12(%rsp)
	addq	$24, %rsp
	.cfi_def_cfa_offset 8
	retq
.Lfunc_end1:
	.size	main, .Lfunc_end1-main
	.cfi_endproc
                                        # -- End function
	.section	".note.GNU-stack","",@progbits
