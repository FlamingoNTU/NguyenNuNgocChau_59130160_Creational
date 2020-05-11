/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bt2;

/**
 *
 * @author Admin
 */
public class MyStringBuilder {
    String str = "";

    @Override
    public String toString() {
        return str;
    }     

    protected MyStringBuilder(StringBuilder stringbuilder) {
        this.str = stringbuilder.str;        
    }
    
    public static class StringBuilder{
        String str = "";

        public StringBuilder() {
        }        
        
        public StringBuilder addString(String s){
            this.str += s;
            return this;
        }
        
        public StringBuilder addFloat(float f){
            this.str += f;
            return this;
        }
        
        public StringBuilder addBool(boolean b){
            this.str += b;
            return this;
        }
        
        public MyStringBuilder build(){
            return new MyStringBuilder(this);
        }
    }  
}
