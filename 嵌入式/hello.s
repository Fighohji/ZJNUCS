.section .data
s:
    .ascii "Hello World\12\0"

.section .text
.globl _start
_start:
    ldr r0, =s
    bl to_upper
    ldr r0, =s
    bl printf
    mov r7, #1
    mov r0, #0
    svc #0

to_upper:
    mov r1, #0
loop:
    ldrb r2, [r0, r1]
    cmp r2, #0
    beq end_loop
    cmp r2, #'a'
    blt next_char
    cmp r2, #'z'
    bgt next_char
    sub r2, r2, #'a' - 'A'
    strb r2, [r0, r1]
next_char:
    add r1, r1, #1
    b loop
end_loop:
    bx lr
