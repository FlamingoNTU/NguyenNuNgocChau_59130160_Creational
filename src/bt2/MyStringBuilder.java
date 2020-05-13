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

    protected MyStringBuilder(Builder builder) {
        this.str = builder.str;        
    }
    
    public static class Builder{
        String str = "";

        public Builder() {
        }                
        
        public Builder addString(String s){
            this.str += s;
            return this;
        }
        
        public Builder addFloat(float f){
            this.str += String.valueOf(f);
            return this;
        }
        
        public Builder addBool(boolean b){
            this.str += String.valueOf(b);
            return this;
        }
        
        public MyStringBuilder build(){
            return new MyStringBuilder(this);
        }
    }  
}
