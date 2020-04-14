/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inversa;

/**
 *
 * @author Batman
 */
public class Calculos {
    public int grado;
    public double [] _a;
    
    public Calculos(int grad){
        grado = grad;
        _a= new double [grado];
    }
    
    public Calculos(int grad , double[] coeficiente){
        grado= grad;
        _a=coeficiente;
    }
    public Calculos(Calculos t){
        grado = t.grado;
        _a= t._a;
    }
    //metodos para enviar
    public void grad(int valor){
        grado=valor;
    }
    
    public void a(double[] coeficiente){
        _a=coeficiente;
    }
    
    public void a(int i, float valor){
        _a[i]=valor;
    }
    
        //metodod para obtener
    
    public int grad(){
        return grado;
    }
    
    public double [] a(){
        return _a;
    }
    
    public double a(int i){
        return _a[i];
    }
    
    //metodos---------------------------------------------------------------
    
    //HORNER-->
    public double Horner(float valx)
    {
        double valor = (_a[grado-2] + _a[grado-1])*valx;
        for (int i=grado-3; i>=0; i--)
        {
            valor = _a[i] + (valor*valx); 
        }
        return valor;
    }
    
    //Rectangulo izquierdo-->
    public double izquierdo(float a, float b, int n){
    double deltax= (b-a)/(double)(n);
    double suma= 0;
        for(int i= 0; i<n; i++){
            suma+=Horner((float)(a+i*deltax));
        }
        return deltax*suma;
    }
    
   //Rectangulo derecho-->
    public double derecho(float a, float b, int n){
        double deltax = (b-a)/(double)(n);
        double suma= 0;
        for(int i=0 ; i<=n; i++){
            suma+= Horner((float)(a+i*deltax));
            
        }
        return deltax*suma;
    }
    
    //Integral metodo trapecio
     public double trapecio(float a, float b, int n){
         return (izquierdo(a,b,n)+ derecho(a,b,n))/2;
     }
     
    // Metodo simpson 1/3 
     
    public double simpson(float a, float b, int n)
    {
        if(n%2!=0)
        {
            n+=1;
        }
        double deltax = (b-a)/(double)(n);
        double sumpar = 0;
        double sumimpar = 0;
        for(int i=1; i<n; i+=2)
        {
            sumimpar+= Horner((float)(a+i*deltax));
        }
        for(int i=2; i<n-1; i+=2)
        {
            sumpar+= Horner((float)(a+i*deltax));
        }
        return (deltax/3)*(Horner(a)*Horner(b)+4*sumimpar+2+sumpar);
    }
     
     //metodo para ver
     
     public String ver(){
        String polinomio="";
            for(int i=grado-1; i>0;i--){
                if(_a[i]!=0){
                    polinomio+=_a[i]+ "*" + "x^" + i + " ";
                }
                if(_a[i-1]>0){
                    polinomio+="+";
                }
            }
            polinomio+=_a[0];
            return polinomio;
     }
}
