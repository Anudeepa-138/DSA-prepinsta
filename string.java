class HelloWorld {
    public static void main(String[] args) {
        String str="this is a good habit";
        String target = "habit";
        boolean found=false;
        char[] arr = str.toCharArray();
        for(int i=0;i<arr.length-target.length()+1;i++)
        {
            String name="";
            for(int j=i; j<i+target.length();j++)
            {
                name+=arr[j];
            }
            //System.out.println(name);
            if(name.equals(target)){
                found = true;
            }
        }
        if(found){
            System.out.println("found");
        }
        else{
            System.out.println("not found");
        }
        
    }
}
