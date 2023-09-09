class conect{
    static String fun(String str){
        String re="";
        str=str.toLowerCase();
        String ar[]=str.split(" ");
        for(int i=0;i<ar.length;i++){
            String st=ar[i];
            int l,r,num=0;
            for(l=0,r=st.length()-1;l<st.length()/2;l++,r--)
                num+=Math.abs((st.charAt(l)-'a'+1)-(st.charAt(r)-'a'+1));
            if(st.length()%2==1)num+=(st.charAt(l)-'a'+1);
            re+=num;
        }
        return re;
    }
    public static void main(String[] args) {
        // try{
        //     //Class.forName("oracle.jdbc.OracleDriver");
        //     //oracle.jdbc.OracleDriver ob=new oracle.jdbc.OracleDriver();
            
        // }
        // catch SQLException{
        //     System.out.println("Error to connect");
        // }
        System.out.println(fun("world wide web"));
    }
}