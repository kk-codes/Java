class StringCases {
    
    public static void main(String[] args) {
        

        String upper = "UPPERCASE";
        String lower = "lowercase";

        String up = lower.toUpperCase();
        String low = upper.toLowerCase();

        System.out.println(up);
        System.out.println(low);

        String mixer = "UppER LoWeR";
        String newMixer = "";
        //System.out.println(mixer.charAt(0) == 85);
        //mixer
        for(int i=0;i<mixer.length();i++)
        {
            if(mixer.charAt(i)>=65 && mixer.charAt(i) <=90)
                newMixer += (char)(((int)mixer.charAt(i))+32);
            else if(mixer.charAt(i)>=97 && mixer.charAt(i) <=122)
                newMixer += (char)(((int)mixer.charAt(i))-32);

            //System.out.println((char)(((int)mixer.charAt(0))+32));
        }
        System.out.println(newMixer);
    }
}