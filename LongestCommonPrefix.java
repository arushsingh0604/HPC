public class LongestCommonPrefix {
    public String longestCommonPrefix(String[] strs) {
        String s = strs[0];
        String Cres = "";
        int Ccount = 0;
        boolean isCont = true;
        String Nres = "";
        for(int i = 0; i<s.length(); i++){
            String check = String.valueOf(s.charAt(i));
            if(isCont == true){
                check = Nres+check;
            }
            int allc = 0;
            int Ncount = 0;
            // String Nres = "";
            for(int j = 0; j<strs.length; j++){
                String cStr = strs[j];
                if(cStr.contains(check) == true){
                    allc++;
                }else{
                    Ccount = 0;
                    isCont = false;
                }
            }if(allc == strs.length && isCont == true){
                Nres = "";
                Cres ="";
                Ncount++;
                Nres += check;
            }else{
                Ncount = 0;
                Nres = "";
            }
            if(Ccount < Ncount){
                Cres = "";
                Ccount = 0;
            }
            Ccount = Ncount;
            Cres += Nres;
        }
        return Cres;
    }
}

