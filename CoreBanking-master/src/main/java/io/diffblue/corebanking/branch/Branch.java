package io.diffblue.corebanking.branch;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Branch {
    private int id;
    private String name;
    private String postcode;

    public Branch(int id, String name, String postcode) {
        this.id = id;
        this.name = name;
        this.postcode = postcode;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getPostcode() {
        return postcode;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPostcode(String postcode) throws BranchException {
        String regex = "^[A-Z]{1,2}[0-9R][0-9A-Z]? [0-9][ABD-HJNP-UW-Z]{2}$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(postcode);

        if(matcher.matches()){
            this.postcode=postcode;
        }
        else{
            throw new BranchException("Invalid postcode");
        }
    }
}
