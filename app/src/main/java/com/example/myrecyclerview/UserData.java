package com.example.myrecyclerview;

import java.util.ArrayList;

public class UserData {

    private static String[] uName = {
            "Jake Wharton",
            "Amit shekhar",
            "Romain Guy",
            "Chris Banes",
            "Davis",
            "Ravi Tamada",
            "Deni Prasetyo",
            "Budi oktaviyan",
            "Hendi santika",
            "sidiq permana"
    };

    private static String[] userName = {
            "JakeWharton",
            "amitshekhariitbhu",
            "romainguy",
            "chrisbanes",
            "tipsy",
            "avi8x",
            "asoet",
            "budioktaviyan",
            "hendisantika",
            "sidiqpermana"
    };
    private static String[] uLocation = {
            "Pittsburgh, PA, USA",
            "New Delhi, India",
            "California",
            "Sydney, Australia",
            "Trondheim, Norway",
            "India",
            "Kotagede, Yogyakarta, Indonesia",
            "Jakarta, Indonesia",
            "Bojongsoang - Bandung Jawa Barat",
            "Jakarta Indonesia"
    };
    private static String[] uRepository = {
            "102",
            "37",
            "9",
            "30",
            "56",
            "28",
            "44",
            "110",
            "1020",
            "2822"
    };
    private static String[] uCompany = {
            "Google, Inc.",
            " MindOrksOpenSource",
            "Google",
            "Google working on @android",
            "Working Group Two",
            "AndroidHive | Droid5",
            "gojek-engineering",
            "KotlinID",
            "VMDeveloperID @KotlinID @IDDevOps",
            "Nusantara Beta Studio"
    };
    private static String[] uFollowers = {
            "10243",
            "3734",
            "933",
            "3034",
            "5634",
            "2834",
            "443",
            "1130",
            "10320",
            "28322"
    };
    private static String[] uFollowing = {
            "502",
            "237",
            "92",
            "3230",
            "256",
            "228",
            "434",
            "1310",
            "10420",
            "28224"
    };
    private static int[] userPhoto = {
            R.drawable.user1,
            R.drawable.user2,
            R.drawable.user3,
            R.drawable.user4,
            R.drawable.user5,
            R.drawable.user6,
            R.drawable.user7,
            R.drawable.user8,
            R.drawable.user9,
            R.drawable.user10
    };

    static ArrayList<User> getListData() {
        ArrayList<User> list = new ArrayList<>();

        for (int position = 0; position < uName.length; position++) {
            User user = new User();
            user.setPhoto(userPhoto[position]);
            user.setName(uName[position]);
            user.setUserName(userName[position]);
            user.setLocation(uLocation[position]);
            user.setCompany(uCompany[position]);
            user.setRepository(uRepository[position]);
            user.setFollowers(uFollowers[position]);
            user.setFollowing(uFollowing[position]);
            list.add(user);
        }
        return list;
    }
}
