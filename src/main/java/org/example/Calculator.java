package org.example;

import org.mozilla.javascript.Scriptable;

import org.mozilla.javascript.Context;

public class Calculator {
    //evaluate an expression
    public double evaluate(String expression){

        //handling 0 division
        if (expression.contains("/0")){
            throw new ArithmeticException(" Cannot divide by zero");
        }
        //a'm using RHINO to evaluate my mathematical expressions
        Context context = Context.enter();
        try{
            //new script scope
            Scriptable scope = context.initStandardObjects();

            //evaluate the expression
            Object result = context.evaluateString(scope, expression, "<cmd>", 1, null);

            return Context.toNumber(result);
        }finally {
            //exit from the context
            Context.exit();
        }
    }
}
