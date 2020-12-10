public class nameEncoderDecoder {
    public boolean areNamesEqual(String name1, String name2) {
        return name1.equals(name2);
    }

    public String makeFullName(String firstName, String lastName) {
        return firstName.toLowerCase() + " " + lastName.toUpperCase();
    }

    public boolean isNameLucky(String name) {
        String lowerCaseName = name.toLowerCase();
        return lowerCaseName.contains("a") || lowerCaseName.contains("o");
    }

    public String getNameCode(String name) {
        String code = name.charAt(0) + String.valueOf(name.charAt(name.length() - 1));
        return code.toUpperCase();
    }

    public boolean isMoneyName(String name) {
        char firstLetter = name.charAt(0);
        char lastLetter = name.charAt(name.length() - 1);

        boolean firstLetterOk = firstLetter >= '0' && firstLetter <= '9';
        boolean lastLetterOk = lastLetter >= '0' && lastLetter <= '9';

        return firstLetterOk && lastLetterOk;
    }

    public boolean isInvisibleName(String name) {
        return name.strip().isEmpty();
    }

    public String makeNamePositive(String name) {
        return name
                .replace("no", "yes")
                .replace("No", "yes")
                .replace("nO", "yes")
                .replace("NO", "yes");
    }

    public String makeNameClean(String name) {
        return "CLEAN" + name.strip() + "CLEAN";
    }
  
  public String makeHalfOfName(String name) {
        int finalIndex = name.length() / 2;
        return name.substring(0, finalIndex);
    }
}
    
