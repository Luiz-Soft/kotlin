<info textAttributesKey="KOTLIN_BUILTIN_ANNOTATION">open</info> class <info textAttributesKey="KOTLIN_CLASS">Foo</info> {
    <info textAttributesKey="KOTLIN_KEYWORD">constructor</info>(<warning descr="[UNUSED_PARAMETER] Parameter 'i' is never used" textAttributesKey="NOT_USED_ELEMENT_ATTRIBUTES"><info textAttributesKey="KOTLIN_PARAMETER">i</info></warning>: <info textAttributesKey="KOTLIN_CLASS">Int</info>)
    <info textAttributesKey="KOTLIN_KEYWORD">constructor</info>(<warning descr="[UNUSED_PARAMETER] Parameter 'd' is never used" textAttributesKey="NOT_USED_ELEMENT_ATTRIBUTES"><info textAttributesKey="KOTLIN_PARAMETER">d</info></warning>: <info textAttributesKey="KOTLIN_CLASS">Double</info>)
}

class <info textAttributesKey="KOTLIN_CLASS">Bar</info> : <info textAttributesKey="KOTLIN_CLASS">Foo</info> {
    <error descr="[EXPLICIT_DELEGATION_CALL_REQUIRED] Explicit 'this' or 'super' call is required. There is no constructor in superclass that can be called without arguments" textAttributesKey="ERRORS_ATTRIBUTES"><info textAttributesKey="KOTLIN_KEYWORD">constructor</info>(s: String)</error> // expected "EXPLICIT_DELEGATION_CALL_REQUIRED Explicit 'this' or 'super' call is required. There is no constructor in superclass that can be called without arguments"
}