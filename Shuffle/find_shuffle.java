//given str1="abc" and str2="def", str3="daebfc"
class Main {
    //first should loop from 0 and skip 1, 
    // second should loop from 1 and skip one
    public static boolean CheckShuffle(String a, String b,String c){
        StringBuilder sb1 = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();
        boolean is_shuffle = false;
        for(int i = 1; i < c.length(); i+=2)
            sb1.append(c.split("")[i]);
        for(int i = 0; i < c.length(); i+=2)
            sb2.append(c.split("")[i]);
        if(sb1.toString().equals(a) && sb2.toString().equals(b))
            is_shuffle = true;
        return is_shuffle;
    }
  public static void main(String[] args) {
      System.out.println(CheckShuffle("abc","dey","daebfc"));
  }
}