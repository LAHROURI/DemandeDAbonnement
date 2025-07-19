/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Demande_D_Abonnement;

/**
 *
 * @author Hamza
 */
public class OnepOOP {
    private static String paymenMethod ;
    private static Float langBranch ;
    private static int nbEtages;
    private static Float superficie ;
    private static Float supSecond ;
    private static Float avance ;
    private static int nbTrim ;
    private static float provission;
    
    OnepOOP(){
        OnepOOP.paymenMethod ="";
        OnepOOP.langBranch=0.f;
        OnepOOP.nbEtages=0;
        OnepOOP.nbTrim=0;
        OnepOOP.avance=0.f;
        OnepOOP.supSecond=0.f;
        OnepOOP.superficie=0.f;
        OnepOOP.provission = 1168.42f;
    }

    /**
     *
     */
    public void reset(){
        OnepOOP.paymenMethod ="";
        OnepOOP.langBranch=0.f;
        OnepOOP.nbEtages=0;
        OnepOOP.nbTrim=0;
        OnepOOP.avance=0.f;
        OnepOOP.supSecond=0.f;
        OnepOOP.superficie=0.f;
    }
    public boolean ifForgot(int lvl){
    if(lvl==1){
    if(OnepOOP.langBranch==0)return true;
    else if (OnepOOP.nbEtages==0)return true;
        else if(OnepOOP.superficie==0)return true;
    }else{
    if(OnepOOP.nbTrim==0)return true;
    }
    return false;
    }
    
    public void setpaymenMethod (String input){
    OnepOOP.paymenMethod = input;
    } 
    public void setlangBranch(Float data){OnepOOP.langBranch = data;}
    public void setnbEtages(int data){OnepOOP.nbEtages = data;}
    public void setsuperficie(Float data){OnepOOP.superficie = data;}
    public void setsupSecond(Float data){OnepOOP.supSecond = data;}
    public void setavance(Float data){OnepOOP.avance = data;}
    public void setnbTrim(int data){OnepOOP.nbTrim = data;}
    
    public String getpaymenMethod (){return OnepOOP.paymenMethod ;}   
    public Float getlangBranch(){return OnepOOP.langBranch;}
    public int getnbEtages(){return OnepOOP.nbEtages ;}
    public Float getsuperficie(){return OnepOOP.superficie;}
    public Float getsupSecond(){return OnepOOP.supSecond ;}
    public Float getavance(){return OnepOOP.avance ;}
    public int getnbTrim(){return OnepOOP.nbTrim ;}
    public Float getprovission(){return OnepOOP.provission ;}
    
}
