class Solution {
    public int lengthOfLastWord(String s) {
     s = s.trim();
        String[] palavras = s.split(" ");
           String ultimaPalavra = palavras[palavras.length - 1];

        return ultimaPalavra.length();
    }
}