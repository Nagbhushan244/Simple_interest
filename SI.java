class Simple_Interest{
    public double P,T,R,S_I;

    Simple_Interest(double P,double T,double R)
    {
        this.P=P;
        this.T=T;
        this.R=R;
    }
    public void calculate_SI()
    {
        S_I=(P*T*R)/100;
        System.out.println("Simple Interest:"+S_I);
    }


    public static void main(String[] args) {
        Simple_Interest s = new Simple_Interest(1000, 2, 15.00);
        s.calculate_SI();
    }
}
