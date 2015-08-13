package secretballcom.example.zion.istory.model;

import secretballcom.example.zion.istory.R;

/**
 * Created by Zion on 13/08/15.
 */
public class Story {
    private Page[] mPages;

    public Story(){
        mPages = new Page[7];
        mPages[0] = new Page(
                R.drawable.page0,
                "Teext",
                new Choice("Stop And Investigate",1),
                new Choice("Continue Home To Earth",2)
        );

        mPages[1] = new Page(
                R.drawable.page1,
                "Teext",
                new Choice("Explore The Cave",3),
                new Choice("Explore The Rover",4)
        );

        mPages[2] = new Page(
                R.drawable.page2,
                "Teext",
                new Choice("Head Back To Mars To Investigate",4),
                new Choice("Continue Home To Earth",6)
        );

        mPages[3] = new Page(
                R.drawable.page3,
                "Teext",
                new Choice("Refill The Ship And Explore The Rover",4),
                new Choice("Continue Towerds The Faint Light",5)
        );

        mPages[4] = new Page(
                R.drawable.page4,
                "Teext",
                new Choice("Explore The Coordinate",5),
                new Choice("Return To Earth",6)
        );

        mPages[5] = new Page(
                R.drawable.page5,
                "Teext"
        );

        mPages[6] = new Page(
                R.drawable.page6,
                "Teext"
        );

    }

    public Page getPage(int pageNumber){
        return mPages[pageNumber];
    }
    }
