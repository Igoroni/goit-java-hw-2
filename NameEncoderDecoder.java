public class NameEncoderDecoder {
    public String encode(String name) {
        String replacedName = name
        .replace("e", "1")
        .replace("u", "2")
        .replace("i", "3")
        .replace("o", "4")
        .replace("a", "5");

        return "NOTFORYOU" + replacedName + "YESnoTFORYOU";
    }
    
    public String decode(String name) {
        int startIndex = 9;
        int endIndex = name.length() - 12;
        String shortenedName = name.substring(startIndex, endIndex);

        return shortenedName
        .replace("1", "e")
        .replace("2", "u")
        .replace("3", "i")
        .replace("4", "o")
        .replace("5", "a");
    }
}
    
