/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Activity10;

import java.text.DecimalFormat;

/**
 *
 * @author L12X17W07
 */
public class GenericClass<T extends Number,S extends Number> implements GenericInterface<T,S>{
    DecimalFormat df = new DecimalFormat("#,###.00");
    private T data1;
    private S data2;
    
    @Override
    public void setData1(T data1){
        this.data1 = data1;
    }
    
    @Override
    public void setData2(S data2){
        this.data2 = data2;
    }
    @Override
    public T getData1(){
        return data1;
    }
    
    @Override
    public S getData2(){
        return data2;
    }
    
    public double computeSum(){
        return data1.doubleValue() + data2.doubleValue();
    }
    
    public double difference(){
        return data1.doubleValue() - data2.doubleValue();
    }

    public double product(){
        return data1.doubleValue() * data2.doubleValue();
    }
    
    public double quotient(){
        return data1.doubleValue() / data2.doubleValue();
    }
    
    public double remainder(){
        return data1.doubleValue() % data2.doubleValue();
    }
  
}
