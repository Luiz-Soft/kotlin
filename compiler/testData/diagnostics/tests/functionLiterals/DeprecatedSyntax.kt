val receiver = { Int.(<!SYNTAX!><!>) <!SYNTAX!>-><!> }
val receiverWithParameter = { Int.<!ILLEGAL_SELECTOR!>(<!UNRESOLVED_REFERENCE!>a<!>)<!> <!SYNTAX!>-><!> }

val receiverAndReturnType = { Int.(<!SYNTAX!><!>)<!SYNTAX!>: Int ->  5<!> }
val receiverAndReturnTypeWithParameter = { Int.(<!UNRESOLVED_REFERENCE!>a<!><!SYNTAX!><!SYNTAX!><!>: Int): Int ->  5<!> }

val returnType = { (<!SYNTAX!><!>): Int -> 5 }
val returnTypeWithParameter = { (<!COMPONENT_FUNCTION_MISSING!>b: Int<!>): Int -> 5 }

val receiverWithFunctionType = { ((Int)<!SYNTAX!><!> <!SYNTAX!>-> Int).() -><!> }

val parenthesizedParameters = { <!CANNOT_INFER_PARAMETER_TYPE!>(a: Int)<!> -> }
val parenthesizedParameters2 = { <!CANNOT_INFER_PARAMETER_TYPE!>(b)<!> -> }

val none = { -> }


val parameterWithFunctionType = { a: ((Int) -> Int) -> <!SYNTAX!><!>} // todo fix parser

val newSyntax = { <!UNUSED_PARAMETER!>a<!>: Int -> }
val newSyntax1 = { <!CANNOT_INFER_PARAMETER_TYPE, UNUSED_PARAMETER!>a<!>, <!CANNOT_INFER_PARAMETER_TYPE, UNUSED_PARAMETER!>b<!> -> }
val newSyntax2 = { <!UNUSED_PARAMETER!>a<!>: Int, <!UNUSED_PARAMETER!>b<!>: Int -> }
val newSyntax3 = { <!CANNOT_INFER_PARAMETER_TYPE, UNUSED_PARAMETER!>a<!>, <!UNUSED_PARAMETER!>b<!>: Int -> }
val newSyntax4 = { <!UNUSED_PARAMETER!>a<!>: Int, <!CANNOT_INFER_PARAMETER_TYPE, UNUSED_PARAMETER!>b<!> -> }
