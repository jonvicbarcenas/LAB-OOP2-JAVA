/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Activity9;

/**
 *
 * @author L12X17W07
 */
public class GenericClass<T, S> {
    private T data1;
    private S data2;
    
    public void setData1(T data1){
        this.data1 = data1;
    }
    
    public T getData1(){
        return data1;
    }

    public void setData2(S data2){
        this.data2 = data2;
    }
    
    public S getData2(){
        return data2;
    }
    
}
