package org.FilesLoader;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class FileLoader {
    public String InputWithVowels;
    public String InputWithoutVowels;
    public String InputWithAllVowels;
    public String EmptyInput;
    public String InputWithCapitalVowels;
    public String Integers;
    public String InputWithSpaces;
    public String InputWithSpecialCharacters;
    public String SqlInjection;

    public String InputWithAnotherLanguage;


    public void jsonReader() throws IOException, ParseException {
        String filePath = "src/test/java/org/JsonFiles/TestData.json";
        File srcFile = new File(filePath);
        JSONParser parser = new JSONParser();
        JSONArray jAraay = (JSONArray) parser.parse(new FileReader(srcFile));

        for (Object jsonObject : jAraay) {
            JSONObject user = (JSONObject) jsonObject;
            InputWithVowels = (String) user.get("InputWithVowels");
            InputWithoutVowels = (String) user.get("InputWithoutVowels");
            InputWithAllVowels = (String) user.get("InputWithAllVowels");
            EmptyInput = (String) user.get("EmptyInput");
            InputWithCapitalVowels = (String) user.get("InputWithCapitalVowels");
            Integers = (String) user.get("Integers");
            InputWithSpaces = (String) user.get("InputWithSpaces");
            InputWithSpecialCharacters = (String) user.get("InputWithSpecialCharacters");
            SqlInjection = (String) user.get("SqlInjection");
            InputWithAnotherLanguage = (String) user.get("InputWithAnotherLanguage");
        }
    }}
