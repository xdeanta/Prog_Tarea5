/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarea5;

import javax.swing.JOptionPane;

/**
 *
 * @author Xavier
 */
public class Metodos {
    public static boolean checkOperandos(String num){
        String [] parsed = num.split("[+/*-]");
        if(parsed.length == 2){
            return true;
        }
        return false;
    }
    public static String operacion(String num){
        char op='0';
        String [] operandos = num.split("[+/*-]");
        String res;
        for(int i=0;i<num.length();i++){
            if(num.charAt(i) == '+'||num.charAt(i) == '-'||num.charAt(i) == '*'||num.charAt(i) == '/'){
                op=num.charAt(i);
                break;
            }
        }
        switch(op){
            case '+':
                res=suma(operandos);
                break;
            case '-':
                res=resta(operandos);
                break;
            case '*':
                res=multi(operandos);
                break;
            case '/':
                res=division(operandos);
                break;
            default:
                res="NaN";
        }
        return res;
    }
    public static String suma(String[] operandos){
        String res;
        int op1,op2,res2;
        float op3,op4,res1;
        boolean[] deci={false, false};
        for(int i=0;i<operandos.length;i++){
            for(int j=0;j<operandos[i].length();j++){
                if(operandos[i].charAt(j)=='.'){
                    deci[i]=true;
                    break;
                }
            }
        }
        if(deci[0]||deci[1]){
            op3=Float.parseFloat(operandos[0]);
            op4=Float.parseFloat(operandos[1]);
            res1=op3+op4;
            res=String.valueOf(res1);
        }else{
            op1=Integer.parseInt(operandos[0]);
            op2=Integer.parseInt(operandos[1]);
            res2=op1+op2;
            res=String.valueOf(res2);
        }
        return res;
    }
    public static String resta(String[] operandos){
        String res;
        int op1,op2,res2;
        float op3,op4,res1;
        boolean[] deci={false, false};
        for(int i=0;i<operandos.length;i++){
            for(int j=0;j<operandos[i].length();j++){
                if(operandos[i].charAt(j)=='.'){
                    deci[i]=true;
                    break;
                }
            }
        }
        if(deci[0]||deci[1]){
            op3=Float.parseFloat(operandos[0]);
            op4=Float.parseFloat(operandos[1]);
            res1=op3-op4;
            res=String.valueOf(res1);
        }else{
            op1=Integer.parseInt(operandos[0]);
            op2=Integer.parseInt(operandos[1]);
            res2=op1-op2;
            res=String.valueOf(res2);
        }
        return res;
    }
    public static String multi(String[] operandos){
        String res;
        int op1,op2,res2;
        float op3,op4,res1;
        boolean[] deci={false, false};
        for(int i=0;i<operandos.length;i++){
            for(int j=0;j<operandos[i].length();j++){
                if(operandos[i].charAt(j)=='.'){
                    deci[i]=true;
                    break;
                }
            }
        }
        if(deci[0]||deci[1]){
            op3=Float.parseFloat(operandos[0]);
            op4=Float.parseFloat(operandos[1]);
            res1=op3*op4;
            res=String.valueOf(res1);
        }else{
            op1=Integer.parseInt(operandos[0]);
            op2=Integer.parseInt(operandos[1]);
            res2=op1*op2;
            res=String.valueOf(res2);
        }
        return res;
    }
    public static String division(String[] operandos){
        String res;
        float op3,op4,res1;
        op3=Float.parseFloat(operandos[0]);
        op4=Float.parseFloat(operandos[1]);
        if(op4!=0){
            res1=op3/op4;
            res=String.valueOf(res1);
        }else{
            res="NaN";
        }
        return res;
    }
}
