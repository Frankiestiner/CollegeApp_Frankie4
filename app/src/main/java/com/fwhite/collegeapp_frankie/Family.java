package com.fwhite.collegeapp_frankie;
import java.util.ArrayList;
public class Family {

    private final String TAG = Family.class.getName();

    private ArrayList<FamilyMember> family;

    private static Family sFamily;

    private Family(){
        family = new ArrayList<>();
        Guardian mom = new Guardian("my", "mother");
        Guardian dad = new Guardian("my", "father");
        Sibling OldBrother = new Sibling("my", "older brother");
        Sibling LilBrother = new Sibling("my", "younger brother");
        family.add(mom);
        family.add(dad);
        family.add(OldBrother);
        family.add(LilBrother);
    }

    public static Family getFamily(){
        if (sFamily == null){
            sFamily = new Family();
        }
        return sFamily;
    }

    public ArrayList<FamilyMember> getFamilyList(){
        return family;
    }

    public void setFamily(ArrayList<FamilyMember> family) {
        this.family = family;
    }

    public void addFamilyMember( FamilyMember fm){ family.add(fm); }

    public void deleteFamilyMember(FamilyMember fm){ family.remove(fm); }

}
