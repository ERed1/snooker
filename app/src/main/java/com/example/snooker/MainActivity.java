package com.example.snooker;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;
import androidx.appcompat.widget.AppCompatImageButton;

import android.annotation.SuppressLint;
import android.content.DialogInterface;
import android.os.Bundle;
import android.text.InputType;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.LinkedList;

public class MainActivity extends AppCompatActivity {
    int NumOfWinsP1 = 0;
    int NumOfWinsP2 = 0;
    int Player1 = 0;
    int Player2 = 0;
    String choice;
    int choice2 = 0;
    int red = 1;
    int yellow = 2;
    int green = 3;
    int brown = 4;
    int blue = 5;
    int pink = 6;
    int black = 7;
    int miss = 0;
    int penalty = 4;
    int penalty2 = 5;
    int penalty3 = 6;
    int penalty4 = 7;
    int numred = 15;
    int numred1 = 1;
    int numyellow = 1, numgreen = 1, numbrown = 1, numblue = 1, numpink = 1, numblack = 1;
    int numblack1 = 0;
    int NumOfPoints = numred * red + numred * black + numyellow * yellow + numgreen * green + numbrown * brown + numblue * blue + numpink * pink + numblack * black;
    int moves = 1; // 1 - Player1 moves, 2 - Player2 moves
    int lastball = 0; // 0 - move change, 1 - red ball, 2 - color ball
    int P1P2 = Player1 - Player2;
    int P2P1 = Player2 - Player1;
    int whosfirst = 1; // 1 - pl1, 2 - pl2
    int in1 = 0;
    int in2 = 0;
    int out1 = 0;
    int out2 = 0;
    float accu1 = 0;
    float accu2 = 0;
    int image = 2;
    int image2 = 2;
    DecimalFormat format = new DecimalFormat("#0.00");
    LinkedList<Integer> pl1list = new LinkedList<>();
    LinkedList<Integer> pl2list = new LinkedList<>();
    LinkedList<Integer> now1list = new LinkedList<>();
    LinkedList<Integer> now2list = new LinkedList<>();
    LinkedList<Integer> nredlist = new LinkedList<>();
    LinkedList<Integer> nred1list = new LinkedList<>();
    LinkedList<Integer> nblacklist = new LinkedList<>();
    LinkedList<Integer> nblack1list = new LinkedList<>();
    LinkedList<Integer> nyellowlist = new LinkedList<>();
    LinkedList<Integer> ngreenlist = new LinkedList<>();
    LinkedList<Integer> nbrownlist = new LinkedList<>();
    LinkedList<Integer> nbluelist = new LinkedList<>();
    LinkedList<Integer> npinklist = new LinkedList<>();
    LinkedList<Integer> moveslist = new LinkedList<>();
    LinkedList<Integer> lastblist = new LinkedList<>();
    LinkedList<Integer> whosfirstlist = new LinkedList<>();
    LinkedList<Integer> in1list = new LinkedList<>();
    LinkedList<Integer> in2list = new LinkedList<>();
    LinkedList<Integer> out1list = new LinkedList<>();
    LinkedList<Integer> out2list = new LinkedList<>();
    LinkedList<Integer> choice2list = new LinkedList<>();
    LinkedList<Integer> p1p2list = new LinkedList<>();
    LinkedList<Integer> p2p1list = new LinkedList<>();


    private static final String KEY_COUNT = "COUNT";
    private static final String KEY_COUNT1 = "COUNT1";
    private static final String KEY_COUNT2 = "COUNT2";
    private static final String KEY_COUNT3 = "COUNT3";
    private static final String KEY_COUNT4 = "COUNT4";
    private static final String KEY_COUNT5 = "COUNT5";
    private static final String KEY_COUNT6 = "COUNT6";
    private static final String KEY_COUNT7 = "COUNT7";
    private static final String KEY_COUNT8 = "COUNT8";
    private static final String KEY_COUNT9 = "COUNT9";
    private static final String KEY_COUNT10 = "COUNT10";
    private static final String KEY_COUNT11 = "COUNT11";
    private static final String KEY_COUNT12 = "COUNT12";
    private static final String KEY_COUNT13 = "COUNT13";
    private static final String KEY_COUNT14 = "COUNT14";
    private static final String KEY_COUNT15 = "COUNT15";
    private static final String KEY_COUNT16 = "COUNT16";
    private static final String KEY_COUNT17 = "COUNT17";
    private static final String KEY_COUNT18 = "COUNT18";
    private static final String KEY_COUNT19 = "COUNT19";
    private static final String KEY_COUNT20 = "COUNT20";
    private static final String KEY_COUNT21 = "COUNT21";
    private static final String KEY_COUNT22 = "COUNT22";
    private static final String KEY_COUNT23 = "COUNT23";
    private static final String KEY_COUNT24 = "COUNT24";
    private static final String KEY_COUNT25 = "COUNT25";
    private static final String KEY_COUNT26 = "COUNT26";
    private static final String KEY_COUNT27 = "COUNT27";
    private static final String KEY_COUNT28 = "COUNT28";
    private static final String KEY_COUNT29 = "COUNT29";
    private static final String KEY_COUNT30 = "COUNT30";
    private static final String KEY_COUNT31 = "COUNT31";
    private static final String KEY_COUNT32 = "COUNT32";
    private static final String KEY_COUNT33 = "COUNT33";
    private static final String KEY_COUNT34 = "COUNT34";
    private static final String KEY_COUNT35 = "COUNT35";
    private static final String KEY_COUNT36 = "COUNT36";
    private static final String KEY_COUNT37 = "COUNT37";
    private static final String KEY_COUNT38 = "COUNT38";
    private static final String KEY_COUNT39 = "COUNT39";
    private static final String KEY_COUNT40 = "COUNT40";
    private static final String KEY_COUNT41 = "COUNT41";
    private static final String KEY_COUNT42 = "COUNT42";
    private static final String KEY_COUNT43 = "COUNT43";
    private static final String KEY_COUNT44 = "COUNT44";
    private static final String KEY_COUNT45 = "COUNT45";
    private static final String KEY_COUNT46 = "COUNT46";
    private static final String KEY_COUNT47 = "COUNT47";

    public void addlist() {
        pl1list.add(Player1);
        pl2list.add(Player2);
        now1list.add(NumOfWinsP1);
        now2list.add(NumOfWinsP2);
        nredlist.add(numred);
        nred1list.add(numred1);
        nblacklist.add(numblack);
        nblack1list.add(numblack1);
        nyellowlist.add(numyellow);
        ngreenlist.add(numgreen);
        nbrownlist.add(numbrown);
        nbluelist.add(numblue);
        npinklist.add(numpink);
        moveslist.add(moves);
        lastblist.add(lastball);
        whosfirstlist.add(whosfirst);
        in1list.add(in1);
        in2list.add(in2);
        out1list.add(out1);
        out2list.add(out2);
        choice2list.add(choice2);
        p1p2list.add(P1P2);
        p2p1list.add(P2P1);
    }

    public void middle_of_frame() {

        final TextView countpl1 = findViewById(R.id.countplayer1);
        final TextView countpl2 = findViewById(R.id.countplayer2);
        final TextView p1p2 = findViewById(R.id.p1p2);
        final TextView p2p1 = findViewById(R.id.p2p1);
        final TextView ontable = findViewById(R.id.ontable);
        final TextView accu1v = findViewById(R.id.accu1);
        final TextView accu2v = findViewById(R.id.accu2);
        try {
            accu1 = (float)in1 / ((float)in1 + (float)out1);
        } catch (ArithmeticException e) {
        }
        try {
            accu2 = (float)in2 / ((float)in2 + (float)out2);
        } catch (ArithmeticException e) {
        }
        if (in1 == 0 & out1 == 0) {
            accu1 = 0;
        }
        if (in2 == 0 & out2 == 0) {
            accu2 = 0;
        }
        /*if (in1 != 0 & out1 != 0) {
            accu1 = ((float)in1 / ((float)in1 + (float)out1) * 100);
        } else if (in1 == 0 & out1 == 0) {
            accu1 = 0;
        }
        if (in2 != 0 & out2 != 0) {
            accu2 = ((float)in2 / ((float)in2 + (float)out2) * 100);
        } else if (in2 == 0 & out2 == 0) {
            accu2 = 0;
        }*/
        P1P2 = Player1 - Player2;
        P2P1 = Player2 - Player1;
        NumOfPoints = numred * red + numred * black + numyellow * yellow + numgreen * green + numbrown * brown + numblue * blue + numpink * pink + numblack * black;
        countpl1.setText(String.valueOf(Player1));
        countpl2.setText(String.valueOf(Player2));
        p1p2.setText(String.valueOf(P1P2));
        p2p1.setText(String.valueOf(P2P1));
        ontable.setText(String.valueOf(NumOfPoints));
        accu1v.setText(format.format(accu1));
        accu2v.setText(format.format(accu2));
    }

    public void end_of_frame() {

        final TextView gamepl1 = findViewById(R.id.gamepl1);
        final TextView gamepl2 = findViewById(R.id.gamepl2);
        final TextView countpl1 = findViewById(R.id.countplayer1);
        final TextView countpl2 = findViewById(R.id.countplayer2);
        final TextView info = findViewById(R.id.info);
        final TextView p1p2 = findViewById(R.id.p1p2);
        final TextView p2p1 = findViewById(R.id.p2p1);
        final TextView ontable = findViewById(R.id.ontable);
        final TextView nred = findViewById(R.id.numred);
        final TextView nblack = findViewById(R.id.numblack);
        final TextView nyellow = findViewById(R.id.numyellow);
        final TextView ngreen = findViewById(R.id.numgreen);
        final TextView nbrown = findViewById(R.id.numbrown);
        final TextView nblue = findViewById(R.id.numblue);
        final TextView npink = findViewById(R.id.numpink);
        final TextView accu1v = findViewById(R.id.accu1);
        final TextView accu2v = findViewById(R.id.accu2);

        if ((Player2 + NumOfPoints) < Player1 & numblack == 0) {

            NumOfWinsP1++;
            Player1 = 0;
            Player2 = 0;
            lastball = 0;
            numred = 15;
            numred1 = 1;
            numyellow = 1;
            numgreen = 1;
            numbrown = 1;
            numblue = 1;
            numpink = 1;
            numblack = 1;
            numblack1 = 0;
            try {
                accu1 = (float)in1 / ((float)in1 + (float)out1);
            } catch (ArithmeticException e) {
            }
            try {
                accu2 = (float)in2 / ((float)in2 + (float)out2);
            } catch (ArithmeticException e) {
            }
            if (in1 == 0 & out1 == 0) {
                accu1 = 0;
            }
            if (in2 == 0 & out2 == 0) {
                accu2 = 0;
            }
            P1P2 = Player1 - Player2;
            P2P1 = Player2 - Player1;
            NumOfPoints = numred * red + numred * black + numyellow * yellow + numgreen * green + numbrown * brown + numblue * blue + numpink * pink + numblack * black;
            gamepl1.setText(String.valueOf(NumOfWinsP1));
            gamepl2.setText(String.valueOf(NumOfWinsP2));
            countpl1.setText(String.valueOf(Player1));
            countpl2.setText(String.valueOf(Player2));
            p1p2.setText(String.valueOf(P1P2));
            p2p1.setText(String.valueOf(P2P1));
            ontable.setText(String.valueOf(NumOfPoints));
            nred.setText(String.valueOf(numred));
            nblack.setText(String.valueOf(numblack));
            nyellow.setText(String.valueOf(numyellow));
            ngreen.setText(String.valueOf(numgreen));
            nbrown.setText(String.valueOf(numbrown));
            nblue.setText(String.valueOf(numblue));
            npink.setText(String.valueOf(numpink));
            accu1v.setText(format.format(accu1));
            accu2v.setText(format.format(accu2));

            if (whosfirst == 1){
                whosfirst = 2;
                moves = 2;
                info.setText("Second player move");
            } else {
                whosfirst = 1;
                moves = 1;
                info.setText("First player move");
            }
        } else if ((Player1 + NumOfPoints) < Player2 & numblack == 0) {
            NumOfWinsP2++;
            Player1 = 0;
            Player2 = 0;
            lastball = 0;
            numred = 15;
            numred1 = 1;
            numyellow = 1;
            numgreen = 1;
            numbrown = 1;
            numblue = 1;
            numpink = 1;
            numblack = 1;
            numblack1 = 0;
            try {
                accu1 = (float)in1 / ((float)in1 + (float)out1);
            } catch (ArithmeticException e) {
            }
            try {
                accu2 = (float)in2 / ((float)in2 + (float)out2);
            } catch (ArithmeticException e) {
            }
            if (in1 == 0 & out1 == 0) {
                accu1 = 0;
            }
            if (in2 == 0 & out2 == 0) {
                accu2 = 0;
            }
            P1P2 = Player1 - Player2;
            P2P1 = Player2 - Player1;
            NumOfPoints = numred * red + numred * black + numyellow * yellow + numgreen * green + numbrown * brown + numblue * blue + numpink * pink + numblack * black;
            gamepl1.setText(String.valueOf(NumOfWinsP1));
            gamepl2.setText(String.valueOf(NumOfWinsP2));
            countpl1.setText(String.valueOf(Player1));
            countpl2.setText(String.valueOf(Player2));
            p1p2.setText(String.valueOf(P1P2));
            p2p1.setText(String.valueOf(P2P1));
            ontable.setText(String.valueOf(NumOfPoints));
            nred.setText(String.valueOf(numred));
            nblack.setText(String.valueOf(numblack));
            nyellow.setText(String.valueOf(numyellow));
            ngreen.setText(String.valueOf(numgreen));
            nbrown.setText(String.valueOf(numbrown));
            nblue.setText(String.valueOf(numblue));
            npink.setText(String.valueOf(numpink));
            accu1v.setText(format.format(accu1));
            accu2v.setText(format.format(accu2));

            if (whosfirst == 1){
                whosfirst = 2;
                moves = 2;
                info.setText("Second player move");
            } else {
                whosfirst = 1;
                moves = 1;
                info.setText("First player move");
            }
        }
    }
    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        addlist();

        if (savedInstanceState != null) {
            NumOfWinsP1 = savedInstanceState.getInt(KEY_COUNT);
            NumOfWinsP2 = savedInstanceState.getInt(KEY_COUNT1);
            Player1 = savedInstanceState.getInt(KEY_COUNT2);
            Player2 = savedInstanceState.getInt(KEY_COUNT3);
            moves = savedInstanceState.getInt(KEY_COUNT4);
            lastball = savedInstanceState.getInt(KEY_COUNT5);
            whosfirst = savedInstanceState.getInt(KEY_COUNT6);
            numred = savedInstanceState.getInt(KEY_COUNT7);
            numblack = savedInstanceState.getInt(KEY_COUNT8);
            numyellow = savedInstanceState.getInt(KEY_COUNT9);
            numgreen = savedInstanceState.getInt(KEY_COUNT10);
            numbrown = savedInstanceState.getInt(KEY_COUNT11);
            numblue = savedInstanceState.getInt(KEY_COUNT12);
            numpink = savedInstanceState.getInt(KEY_COUNT13);
            numred1 = savedInstanceState.getInt(KEY_COUNT14);
            numblack1 = savedInstanceState.getInt(KEY_COUNT15);
            in1 = savedInstanceState.getInt(KEY_COUNT32);
            in2 = savedInstanceState.getInt(KEY_COUNT33);
            out1 = savedInstanceState.getInt(KEY_COUNT34);
            out2 = savedInstanceState.getInt(KEY_COUNT35);
            image = savedInstanceState.getInt(KEY_COUNT40);
            image2 = savedInstanceState.getInt(KEY_COUNT41);
            choice2 = savedInstanceState.getInt(KEY_COUNT42);
            P1P2 = savedInstanceState.getInt(KEY_COUNT44);
            P2P1 = savedInstanceState.getInt(KEY_COUNT45);
            ArrayList<Integer> now1arlist = savedInstanceState.getIntegerArrayList(KEY_COUNT16);
            ArrayList<Integer> now2arlist = savedInstanceState.getIntegerArrayList(KEY_COUNT17);
            ArrayList<Integer> pl1arlist = savedInstanceState.getIntegerArrayList(KEY_COUNT18);
            ArrayList<Integer> pl2arlist = savedInstanceState.getIntegerArrayList(KEY_COUNT19);
            ArrayList<Integer> nredarlist = savedInstanceState.getIntegerArrayList(KEY_COUNT23);
            ArrayList<Integer> nred1arlist = savedInstanceState.getIntegerArrayList(KEY_COUNT24);
            ArrayList<Integer> nblackarlist = savedInstanceState.getIntegerArrayList(KEY_COUNT30);
            ArrayList<Integer> nblack1arlist = savedInstanceState.getIntegerArrayList(KEY_COUNT31);
            ArrayList<Integer> nyellowarlist = savedInstanceState.getIntegerArrayList(KEY_COUNT25);
            ArrayList<Integer> ngreenarlist = savedInstanceState.getIntegerArrayList(KEY_COUNT26);
            ArrayList<Integer> nbrownarlist = savedInstanceState.getIntegerArrayList(KEY_COUNT27);
            ArrayList<Integer> nbluearlist = savedInstanceState.getIntegerArrayList(KEY_COUNT28);
            ArrayList<Integer> npinkarlist = savedInstanceState.getIntegerArrayList(KEY_COUNT29);
            ArrayList<Integer> movesarlist = savedInstanceState.getIntegerArrayList(KEY_COUNT20);
            ArrayList<Integer> lastbarlist = savedInstanceState.getIntegerArrayList(KEY_COUNT21);
            ArrayList<Integer> whosfirstarlist = savedInstanceState.getIntegerArrayList(KEY_COUNT22);
            ArrayList<Integer> in1arlist = savedInstanceState.getIntegerArrayList(KEY_COUNT36);
            ArrayList<Integer> in2arlist = savedInstanceState.getIntegerArrayList(KEY_COUNT37);
            ArrayList<Integer> out1arlist = savedInstanceState.getIntegerArrayList(KEY_COUNT38);
            ArrayList<Integer> out2arlist = savedInstanceState.getIntegerArrayList(KEY_COUNT39);
            ArrayList<Integer> choice2arlist = savedInstanceState.getIntegerArrayList(KEY_COUNT43);
            ArrayList<Integer> p1p2arlist = savedInstanceState.getIntegerArrayList(KEY_COUNT46);
            ArrayList<Integer> p2p1arlist = savedInstanceState.getIntegerArrayList(KEY_COUNT47);
            now1list = new LinkedList<>(now1arlist);
            now2list = new LinkedList<>(now2arlist);
            pl1list = new LinkedList<>(pl1arlist);
            pl2list = new LinkedList<>(pl2arlist);
            moveslist = new LinkedList<>(movesarlist);
            lastblist = new LinkedList<>(lastbarlist);
            whosfirstlist = new LinkedList<>(whosfirstarlist);
            nredlist = new LinkedList<>(nredarlist);
            nblacklist = new LinkedList<>(nblackarlist);
            nyellowlist = new LinkedList<>(nyellowarlist);
            ngreenlist = new LinkedList<>(ngreenarlist);
            nbrownlist = new LinkedList<>(nbrownarlist);
            nbluelist = new LinkedList<>(nbluearlist);
            npinklist = new LinkedList<>(npinkarlist);
            nred1list = new LinkedList<>(nred1arlist);
            nblack1list = new LinkedList<>(nblack1arlist);
            in1list = new LinkedList<>(in1arlist);
            in2list = new LinkedList<>(in2arlist);
            out1list = new LinkedList<>(out1arlist);
            out2list = new LinkedList<>(out2arlist);
            choice2list = new LinkedList<>(choice2arlist);
            p1p2list = new LinkedList<>(p1p2arlist);
            p2p1list = new LinkedList<>(p2p1arlist);

        } else {
            NumOfWinsP1 = 0;
            NumOfWinsP2 = 0;
            Player1 = 0;
            Player2 = 0;
            moves = 1;
            lastball = 0;
            whosfirst = 1;
            numred = 15;
            numred1 = 1;
            numblack = 1;
            numblack1 = 0;
            numyellow = 1;
            numgreen = 1;
            numbrown = 1;
            numblue = 1;
            numpink = 1;
            in1 = 0;
            in2 = 0;
            out1 = 0;
            out2 = 0;
            choice2 = 0;
        }

        final AppCompatImageButton redbtn = findViewById(R.id.redbtn);
        final AppCompatImageButton blackbtn = findViewById(R.id.blackbtn);
        final AppCompatImageButton yellowbtn = findViewById(R.id.yellowbtn);
        final AppCompatImageButton greenbtn = findViewById(R.id.greenbtn);
        final AppCompatImageButton brownbtn = findViewById(R.id.brownbtn);
        final AppCompatImageButton bluebtn = findViewById(R.id.bluebtn);
        final AppCompatImageButton pinkbtn = findViewById(R.id.pinkbtn);
        final AppCompatButton missbtn = findViewById(R.id.missbtn);
        final AppCompatButton penaltybtn = findViewById(R.id.penaltybtn);
        final AppCompatButton newgamebtn = findViewById(R.id.newgamebtn);
        final AppCompatButton clearbtn = findViewById(R.id.clearbtn);
        final AppCompatButton undobtn = findViewById(R.id.undobtn);
        final EditText Pl1 = findViewById(R.id.player1);
        final EditText Pl2 = findViewById(R.id.player2);
        final TextView gamepl1 = findViewById(R.id.gamepl1);
        final TextView gamepl2 = findViewById(R.id.gamepl2);
        final TextView countpl1 = findViewById(R.id.countplayer1);
        final TextView countpl2 = findViewById(R.id.countplayer2);
        final TextView info = findViewById(R.id.info);
        final TextView p1p2 = findViewById(R.id.p1p2);
        final TextView p2p1 = findViewById(R.id.p2p1);
        final TextView ontable = findViewById(R.id.ontable);
        final TextView nred = findViewById(R.id.numred);
        final TextView nblack = findViewById(R.id.numblack);
        final TextView nyellow = findViewById(R.id.numyellow);
        final TextView ngreen = findViewById(R.id.numgreen);
        final TextView nbrown = findViewById(R.id.numbrown);
        final TextView nblue = findViewById(R.id.numblue);
        final TextView npink = findViewById(R.id.numpink);
        final TextView dots = findViewById(R.id.dots);
        final TextView dots2 = findViewById(R.id.dots2);
        final TextView accu1v = findViewById(R.id.accu1);
        final TextView accu2v = findViewById(R.id.accu2);
        final ImageView table = findViewById(R.id.table);
        if (image == 2) {
            countpl1.setBackgroundResource(R.drawable.circlegreen4);
            accu1v.setBackgroundResource(R.drawable.circlegreen4);
            countpl2.setBackgroundResource(R.drawable.circlegreen3);
            accu2v.setBackgroundResource(R.drawable.circlegreen3);
            ontable.setBackgroundResource(R.drawable.circlegreen5);
            info.setBackgroundResource(R.drawable.circlegreen);
            penaltybtn.setBackgroundResource(R.drawable.circlegreen);
            missbtn.setBackgroundResource(R.drawable.circlegreen);
            undobtn.setBackgroundResource(R.drawable.circlegreen);
            newgamebtn.setBackgroundResource(R.drawable.circlegreen);
            clearbtn.setBackgroundResource(R.drawable.circlegreen);
        } else if (image == 3) {
            countpl1.setBackgroundResource(R.drawable.circlered4);
            accu1v.setBackgroundResource(R.drawable.circlered4);
            countpl2.setBackgroundResource(R.drawable.circlered3);
            accu2v.setBackgroundResource(R.drawable.circlered3);
            ontable.setBackgroundResource(R.drawable.circlered5);
            info.setBackgroundResource(R.drawable.circlered);
            penaltybtn.setBackgroundResource(R.drawable.circlered);
            missbtn.setBackgroundResource(R.drawable.circlered);
            undobtn.setBackgroundResource(R.drawable.circlered);
            newgamebtn.setBackgroundResource(R.drawable.circlered);
            clearbtn.setBackgroundResource(R.drawable.circlered);
        } else if (image == 4) {
            countpl1.setBackgroundResource(R.drawable.circleblue4);
            accu1v.setBackgroundResource(R.drawable.circleblue4);
            countpl2.setBackgroundResource(R.drawable.circleblue3);
            accu2v.setBackgroundResource(R.drawable.circleblue3);
            ontable.setBackgroundResource(R.drawable.circleblue5);
            info.setBackgroundResource(R.drawable.circleblue);
            penaltybtn.setBackgroundResource(R.drawable.circleblue);
            missbtn.setBackgroundResource(R.drawable.circleblue);
            undobtn.setBackgroundResource(R.drawable.circleblue);
            newgamebtn.setBackgroundResource(R.drawable.circleblue);
            clearbtn.setBackgroundResource(R.drawable.circleblue);
        } else if (image == 5) {
            countpl1.setBackgroundResource(R.drawable.circleorange4);
            accu1v.setBackgroundResource(R.drawable.circleorange4);
            countpl2.setBackgroundResource(R.drawable.circleorange3);
            accu2v.setBackgroundResource(R.drawable.circleorange3);
            ontable.setBackgroundResource(R.drawable.circleorange5);
            info.setBackgroundResource(R.drawable.circleorange);
            penaltybtn.setBackgroundResource(R.drawable.circleorange);
            missbtn.setBackgroundResource(R.drawable.circleorange);
            undobtn.setBackgroundResource(R.drawable.circleorange);
            newgamebtn.setBackgroundResource(R.drawable.circleorange);
            clearbtn.setBackgroundResource(R.drawable.circleorange);
        } else if (image == 6) {
            countpl1.setBackgroundResource(R.drawable.circleviolet4);
            accu1v.setBackgroundResource(R.drawable.circleviolet4);
            countpl2.setBackgroundResource(R.drawable.circleviolet3);
            accu2v.setBackgroundResource(R.drawable.circleviolet3);
            ontable.setBackgroundResource(R.drawable.circleviolet5);
            info.setBackgroundResource(R.drawable.circleviolet);
            penaltybtn.setBackgroundResource(R.drawable.circleviolet);
            missbtn.setBackgroundResource(R.drawable.circleviolet);
            undobtn.setBackgroundResource(R.drawable.circleviolet);
            newgamebtn.setBackgroundResource(R.drawable.circleviolet);
            clearbtn.setBackgroundResource(R.drawable.circleviolet);
        } else if (image == 7) {
            countpl1.setBackgroundResource(R.drawable.circleyellow4);
            accu1v.setBackgroundResource(R.drawable.circleyellow4);
            countpl2.setBackgroundResource(R.drawable.circleyellow3);
            accu2v.setBackgroundResource(R.drawable.circleyellow3);
            ontable.setBackgroundResource(R.drawable.circleyellow5);
            info.setBackgroundResource(R.drawable.circleyellow);
            penaltybtn.setBackgroundResource(R.drawable.circleyellow);
            missbtn.setBackgroundResource(R.drawable.circleyellow);
            undobtn.setBackgroundResource(R.drawable.circleyellow);
            newgamebtn.setBackgroundResource(R.drawable.circleyellow);
            clearbtn.setBackgroundResource(R.drawable.circleyellow);
        }
        if (image2 == 2) {
            table.setImageResource(R.drawable.tablegreen);
        } else if (image2 == 3) {
            table.setImageResource(R.drawable.tablered);
        } else if (image2 == 4) {
            table.setImageResource(R.drawable.tableblue);
        } else if (image2 == 5) {
            table.setImageResource(R.drawable.tableorange);
        } else if (image2 == 6) {
            table.setImageResource(R.drawable.tableviolet);
        } else if (image2 == 7) {
            table.setImageResource(R.drawable.tableyellow);
        }
        Pl1.setInputType(InputType.TYPE_TEXT_FLAG_NO_SUGGESTIONS);
        Pl2.setInputType(InputType.TYPE_TEXT_FLAG_NO_SUGGESTIONS);

        Pl1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Pl1.setCursorVisible(true);
                Pl2.setCursorVisible(true);
            }
        });
        Pl2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Pl1.setCursorVisible(true);
                Pl2.setCursorVisible(true);
            }
        });
        dots2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (image2 == 2) {
                    image2 = 3;
                    table.setImageResource(R.drawable.tablered);
                }  else if (image2 == 3) {
                    image2 = 4;
                    table.setImageResource(R.drawable.tableblue);
                } else if (image2 == 4) {
                    image2 = 5;
                    table.setImageResource(R.drawable.tableorange);
                } else if (image2 == 5) {
                    image2 = 6;
                    table.setImageResource(R.drawable.tableviolet);
                } else if (image2 == 6) {
                    image2 = 7;
                    table.setImageResource(R.drawable.tableyellow);
                } else if (image2 == 7) {
                    image2 = 2;
                    table.setImageResource(R.drawable.tablegreen);
                }
            }
        });
        dots.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (image == 2) {
                    image = 3;
                    countpl1.setBackgroundResource(R.drawable.circlered4);
                    accu1v.setBackgroundResource(R.drawable.circlered4);
                    countpl2.setBackgroundResource(R.drawable.circlered3);
                    accu2v.setBackgroundResource(R.drawable.circlered3);
                    ontable.setBackgroundResource(R.drawable.circlered5);
                    info.setBackgroundResource(R.drawable.circlered);
                    penaltybtn.setBackgroundResource(R.drawable.circlered);
                    missbtn.setBackgroundResource(R.drawable.circlered);
                    undobtn.setBackgroundResource(R.drawable.circlered);
                    newgamebtn.setBackgroundResource(R.drawable.circlered);
                    clearbtn.setBackgroundResource(R.drawable.circlered);

                } else if (image == 3) {
                    image = 4;
                    countpl1.setBackgroundResource(R.drawable.circleblue4);
                    accu1v.setBackgroundResource(R.drawable.circleblue4);
                    countpl2.setBackgroundResource(R.drawable.circleblue3);
                    accu2v.setBackgroundResource(R.drawable.circleblue3);
                    ontable.setBackgroundResource(R.drawable.circleblue5);
                    info.setBackgroundResource(R.drawable.circleblue);
                    penaltybtn.setBackgroundResource(R.drawable.circleblue);
                    missbtn.setBackgroundResource(R.drawable.circleblue);
                    undobtn.setBackgroundResource(R.drawable.circleblue);
                    newgamebtn.setBackgroundResource(R.drawable.circleblue);
                    clearbtn.setBackgroundResource(R.drawable.circleblue);
                } else if (image == 4) {
                    image = 5;
                    countpl1.setBackgroundResource(R.drawable.circleorange4);
                    accu1v.setBackgroundResource(R.drawable.circleorange4);
                    countpl2.setBackgroundResource(R.drawable.circleorange3);
                    accu2v.setBackgroundResource(R.drawable.circleorange3);
                    ontable.setBackgroundResource(R.drawable.circleorange5);
                    info.setBackgroundResource(R.drawable.circleorange);
                    penaltybtn.setBackgroundResource(R.drawable.circleorange);
                    missbtn.setBackgroundResource(R.drawable.circleorange);
                    undobtn.setBackgroundResource(R.drawable.circleorange);
                    newgamebtn.setBackgroundResource(R.drawable.circleorange);
                    clearbtn.setBackgroundResource(R.drawable.circleorange);
                } else if (image == 5) {
                    image = 6;
                    countpl1.setBackgroundResource(R.drawable.circleviolet4);
                    accu1v.setBackgroundResource(R.drawable.circleviolet4);
                    countpl2.setBackgroundResource(R.drawable.circleviolet3);
                    accu2v.setBackgroundResource(R.drawable.circleviolet3);
                    ontable.setBackgroundResource(R.drawable.circleviolet5);
                    info.setBackgroundResource(R.drawable.circleviolet);
                    penaltybtn.setBackgroundResource(R.drawable.circleviolet);
                    missbtn.setBackgroundResource(R.drawable.circleviolet);
                    undobtn.setBackgroundResource(R.drawable.circleviolet);
                    newgamebtn.setBackgroundResource(R.drawable.circleviolet);
                    clearbtn.setBackgroundResource(R.drawable.circleviolet);
                } else if (image == 6) {
                    image = 7;
                    countpl1.setBackgroundResource(R.drawable.circleyellow4);
                    accu1v.setBackgroundResource(R.drawable.circleyellow4);
                    countpl2.setBackgroundResource(R.drawable.circleyellow3);
                    accu2v.setBackgroundResource(R.drawable.circleyellow3);
                    ontable.setBackgroundResource(R.drawable.circleyellow5);
                    info.setBackgroundResource(R.drawable.circleyellow);
                    penaltybtn.setBackgroundResource(R.drawable.circleyellow);
                    missbtn.setBackgroundResource(R.drawable.circleyellow);
                    undobtn.setBackgroundResource(R.drawable.circleyellow);
                    newgamebtn.setBackgroundResource(R.drawable.circleyellow);
                    clearbtn.setBackgroundResource(R.drawable.circleyellow);
                } else if (image == 7) {
                    image = 2;
                    countpl1.setBackgroundResource(R.drawable.circlegreen4);
                    accu1v.setBackgroundResource(R.drawable.circlegreen4);
                    countpl2.setBackgroundResource(R.drawable.circlegreen3);
                    accu2v.setBackgroundResource(R.drawable.circlegreen3);
                    ontable.setBackgroundResource(R.drawable.circlegreen5);
                    info.setBackgroundResource(R.drawable.circlegreen);
                    penaltybtn.setBackgroundResource(R.drawable.circlegreen);
                    missbtn.setBackgroundResource(R.drawable.circlegreen);
                    undobtn.setBackgroundResource(R.drawable.circlegreen);
                    newgamebtn.setBackgroundResource(R.drawable.circlegreen);
                    clearbtn.setBackgroundResource(R.drawable.circlegreen);
                }
            }
        });

        try {
            accu1 = (float)in1 / ((float)in1 + (float)out1);
        } catch (ArithmeticException e) {
        }
        try {
            accu2 = (float)in2 / ((float)in2 + (float)out2);
        } catch (ArithmeticException e) {
        }
        if (in1 == 0 & out1 == 0) {
            accu1 = 0;
        }
        if (in2 == 0 & out2 == 0) {
            accu2 = 0;
        }

        nred.setText(String.valueOf(numred));
        nblack.setText(String.valueOf(numblack));
        nyellow.setText(String.valueOf(numyellow));
        ngreen.setText(String.valueOf(numgreen));
        nbrown.setText(String.valueOf(numbrown));
        nblue.setText(String.valueOf(numblue));
        npink.setText(String.valueOf(numpink));
        gamepl1.setText(String.valueOf(NumOfWinsP1));
        gamepl2.setText(String.valueOf(NumOfWinsP2));
        countpl1.setText(String.valueOf(Player1));
        countpl2.setText(String.valueOf(Player2));
        p1p2.setText(String.valueOf(P1P2));
        p2p1.setText(String.valueOf(P2P1));
        ontable.setText(String.valueOf(NumOfPoints));
        accu1v.setText(format.format(accu1));
        accu2v.setText(format.format(accu2));
        info.setText("First player move");

        final Animation scale = AnimationUtils.loadAnimation(this,R.anim.scale);
        redbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                v.startAnimation(scale);
                Pl1.setCursorVisible(false);
                Pl2.setCursorVisible(false);

                if (moves == 1 & numred > 0) {
                    Player1 = Player1 + red;
                    numred = numred - 1;
                    lastball = 1;
                    in1++;
                    nred.setText(String.valueOf(numred));
                    info.setText("First player move");

                    addlist();
                    middle_of_frame();
                    end_of_frame();
                } else if (moves == 2 & numred > 0) {
                    Player2 = Player2 + red;
                    numred = numred - 1;
                    lastball = 1;
                    in2++;
                    nred.setText(String.valueOf(numred));
                    info.setText("Second player move");

                    addlist();
                    middle_of_frame();
                    end_of_frame();
                }
            }
        });
        blackbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                v.startAnimation(scale);
                if (moves == 1 & numred > 0 & lastball == 1 & choice2 == 0) {
                    Player1 = Player1 + black;
                    lastball = 2;
                    in1++;
                    info.setText("First player move");

                    addlist();
                    middle_of_frame();
                    end_of_frame();
                } else if (moves == 2 & numred > 0 & lastball == 1 & choice2 == 0) {
                    Player2 = Player2 + black;
                    lastball = 2;
                    in2++;
                    info.setText("Second player move");

                    addlist();
                    middle_of_frame();
                    end_of_frame();
                } else if (moves == 1 & numred > 0 & lastball != 1 & choice2 == 0) {
                    Player2 = Player2 + penalty4;
                    lastball = 0;
                    moves = 2;
                    out1++;
                    info.setText("Second player move");

                    addlist();
                    middle_of_frame();
                    end_of_frame();
                } else if (moves == 2 & numred > 0 & lastball != 1 & choice2 == 0) {
                    Player1 = Player1 + penalty4;
                    lastball = 0;
                    moves = 1;
                    out2++;
                    info.setText("First player move");

                    addlist();
                    middle_of_frame();
                    end_of_frame();
                } else if (moves == 1 & Player1 != Player2 & numred1 == 0 & numpink == 0 & numblack != 0 & choice2 == 0) {
                    Player1 = Player1 + black;
                    lastball = 0;
                    in1++;
                    if (Player1 != Player2) {
                        numblack = 0;
                        numblack1 = 1;
                        nblack.setText(String.valueOf(numblack));
                    } else {
                        numblack = 0;
                        numblack1 = 1;
                        nblack.setText(String.valueOf(numblack1));
                    }
                    info.setText("First player move");

                    addlist();
                    middle_of_frame();
                    end_of_frame();
                } else if (moves == 1 & numred1 == 0 & numpink != 0 & numblack != 0 & choice2 == 0) {
                    Player2 = Player2 + penalty4;
                    lastball = 0;
                    moves = 2;
                    out1++;
                    info.setText("Second player move");

                    addlist();
                    middle_of_frame();
                    end_of_frame();
                } else if (moves == 2 & Player1 != Player2 & numred1 == 0 & numpink == 0 & numblack != 0 & choice2 == 0) {
                    Player2 = Player2 + black;
                    lastball = 0;
                    in2++;
                    if (Player1 != Player2) {
                        numblack = 0;
                        numblack1 = 1;
                        nblack.setText(String.valueOf(numblack));
                    } else {
                        numblack = 0;
                        numblack1 = 1;
                        nblack.setText(String.valueOf(numblack1));
                    }
                    info.setText("Second player move");

                    addlist();
                    middle_of_frame();
                    end_of_frame();
                } else if (moves == 2 & numred1 == 0 & numpink != 0 & numblack != 0 & choice2 == 0) {
                    Player1 = Player1 + penalty4;
                    lastball = 0;
                    moves = 1;
                    out2++;
                    info.setText("First player move");

                    addlist();
                    middle_of_frame();
                    end_of_frame();
                } else if (moves == 1 & numred == 0 & lastball == 1 & numblack != 0 & choice2 == 0) {
                    Player1 = Player1 + black;
                    numred1 = 0;
                    lastball = 0;
                    in1++;
                    info.setText("First player move");

                    addlist();
                    middle_of_frame();
                    end_of_frame();
                } else if (moves == 2 & numred == 0 & lastball == 1 & numblack != 0 & choice2 == 0) {
                    Player2 = Player2 + black;
                    numred1 = 0;
                    lastball = 0;
                    in2++;
                    info.setText("Second player move");

                    addlist();
                    middle_of_frame();
                    end_of_frame();
                } else if (moves == 1 & numred == 0 & lastball != 1 & numblack != 0 & numpink != 0 & choice2 == 0) {
                    Player2 = Player2 + penalty4;
                    numred1 = 0;
                    lastball = 0;
                    moves = 2;
                    out1++;
                    info.setText("Second player move");

                    addlist();
                    middle_of_frame();
                    end_of_frame();
                } else if (moves == 2 & numred == 0 & lastball != 1 & numblack != 0 & numpink != 0 & choice2 == 0) {
                    Player1 = Player1 + penalty4;
                    numred1 = 0;
                    lastball = 0;
                    moves = 1;
                    out2++;
                    info.setText("First player move");

                    addlist();
                    middle_of_frame();
                    end_of_frame();
                } else if (moves == 1 & Player1 == Player2 & numpink == 0 & numblack1 != 0 & numblack == 0) {
                    Player1 = Player1 + black;
                    numblack1 = 0;
                    in1++;
                    info.setText("First player move");

                    addlist();
                    middle_of_frame();
                    end_of_frame();
                } else if (moves == 2 & Player1 == Player2 & numpink == 0 & numblack1 != 0 & numblack == 0) {
                    Player2 = Player2 + black;
                    numblack1 = 0;
                    in2++;
                    info.setText("Second player move");

                    addlist();
                    middle_of_frame();
                    end_of_frame();
                } else if (moves == 1 & numred > 0 & lastball == 0 & choice2 == 1) {
                    Player1 = Player1 + red;
                    lastball = 1;
                    in1++;
                    choice2 = 0;
                    info.setText("First player move");

                    addlist();
                    middle_of_frame();
                    end_of_frame();
                } else if (moves == 2 & numred > 0 & lastball == 0 & choice2 == 1) {
                    Player2 = Player2 + red;
                    lastball = 1;
                    in2++;
                    choice2 = 0;
                    info.setText("Second player move");

                    addlist();
                    middle_of_frame();
                    end_of_frame();
                } else if (moves == 1 & numred == 0 & lastball == 0 & numyellow != 0 & choice2 == 1) {
                    Player1 = Player1 + yellow;
                    numred1 = 0;
                    lastball = 0;
                    in1++;
                    choice2 = 0;
                    info.setText("First player move");
                    nyellow.setText(String.valueOf(numyellow));

                    addlist();
                    middle_of_frame();
                    end_of_frame();
                } else if (moves == 2 & numred == 0 & lastball == 0 & numyellow != 0 & choice2 == 1) {
                    Player2 = Player2 + yellow;
                    numred1 = 0;
                    lastball = 0;
                    in2++;
                    choice2 = 0;
                    info.setText("Second player move");
                    nyellow.setText(String.valueOf(numyellow));

                    addlist();
                    middle_of_frame();
                    end_of_frame();
                } else if (moves == 1 & numred == 0 & lastball == 0 & numyellow == 0 & numgreen != 0 & choice2 == 1) {
                    Player1 = Player1 + green;
                    numred1 = 0;
                    lastball = 0;
                    in1++;
                    choice2 = 0;
                    info.setText("First player move");
                    ngreen.setText(String.valueOf(numgreen));

                    addlist();
                    middle_of_frame();
                    end_of_frame();
                } else if (moves == 2 & numred == 0 & lastball == 0 & numyellow == 0 & numgreen != 0 & choice2 == 1) {
                    Player2 = Player2 + green;
                    numred1 = 0;
                    lastball = 0;
                    in2++;
                    choice2 = 0;
                    info.setText("Second player move");
                    ngreen.setText(String.valueOf(numgreen));

                    addlist();
                    middle_of_frame();
                    end_of_frame();
                } else if (moves == 1 & numred == 0 & lastball == 0 & numgreen == 0 & numbrown != 0 & choice2 == 1) {
                    Player1 = Player1 + brown;
                    numred1 = 0;
                    lastball = 0;
                    in1++;
                    choice2 = 0;
                    info.setText("First player move");
                    nbrown.setText(String.valueOf(numbrown));

                    addlist();
                    middle_of_frame();
                    end_of_frame();
                } else if (moves == 2 & numred == 0 & lastball == 0 & numgreen == 0 & numbrown != 0 & choice2 == 1) {
                    Player2 = Player2 + brown;
                    numred1 = 0;
                    lastball = 0;
                    in2++;
                    choice2 = 0;
                    info.setText("Second player move");
                    nbrown.setText(String.valueOf(numbrown));

                    addlist();
                    middle_of_frame();
                    end_of_frame();
                } else if (moves == 1 & numred == 0 & lastball == 0 & numbrown == 0 & numblue != 0 & choice2 == 1) {
                    Player1 = Player1 + blue;
                    numred1 = 0;
                    lastball = 0;
                    in1++;
                    choice2 = 0;
                    info.setText("First player move");
                    nblue.setText(String.valueOf(numblue));

                    addlist();
                    middle_of_frame();
                    end_of_frame();
                } else if (moves == 2 & numred == 0 & lastball == 0 & numbrown == 0 & numblue != 0 & choice2 == 1) {
                    Player2 = Player2 + blue;
                    numred1 = 0;
                    lastball = 0;
                    in2++;
                    choice2 = 0;
                    info.setText("Second player move");
                    nblue.setText(String.valueOf(numblue));

                    addlist();
                    middle_of_frame();
                    end_of_frame();
                } else if (moves == 1 & numred == 0 & lastball == 0 & numblue == 0 & numpink != 0 & choice2 == 1) {
                    Player1 = Player1 + pink;
                    numred1 = 0;
                    lastball = 0;
                    in1++;
                    choice2 = 0;
                    info.setText("First player move");
                    npink.setText(String.valueOf(numpink));

                    addlist();
                    middle_of_frame();
                    end_of_frame();
                } else if (moves == 2 & numred == 0 & lastball == 0 & numblue == 0 & numpink != 0 & choice2 == 1) {
                    Player2 = Player2 + pink;
                    numred1 = 0;
                    lastball = 0;
                    in2++;
                    choice2 = 0;
                    info.setText("Second player move");
                    npink.setText(String.valueOf(numpink));

                    addlist();
                    middle_of_frame();
                    end_of_frame();
                }
            }
        });
        yellowbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                v.startAnimation(scale);
                if (moves == 1 & numred > 0 & lastball == 1 & choice2 == 0) {
                    Player1 = Player1 + yellow;
                    lastball = 2;
                    in1++;
                    info.setText("First player move");

                    addlist();
                    middle_of_frame();
                    end_of_frame();
                } else if (moves == 2 & numred > 0 & lastball == 1 & choice2 == 0) {
                    Player2 = Player2 + yellow;
                    lastball = 2;
                    in2++;
                    info.setText("Second player move");

                    addlist();
                    middle_of_frame();
                    end_of_frame();
                } else if (moves == 1 & numred > 0 & lastball != 1 & choice2 == 0) {
                    Player2 = Player2 + penalty;
                    lastball = 0;
                    moves = 2;
                    out1++;
                    info.setText("Second player move");

                    addlist();
                    middle_of_frame();
                    end_of_frame();
                } else if (moves == 2 & numred > 0 & lastball != 1 & choice2 == 0) {
                    Player1 = Player1 + penalty;
                    lastball = 0;
                    moves = 1;
                    out2++;
                    info.setText("First player move");

                    addlist();
                    middle_of_frame();
                    end_of_frame();
                } else if (moves == 1 & numred1 == 0 & numyellow != 0 & choice2 == 0) {
                    Player1 = Player1 + yellow;
                    numyellow = 0;
                    lastball = 0;
                    in1++;
                    nyellow.setText(String.valueOf(numyellow));
                    info.setText("First player move");

                    addlist();
                    middle_of_frame();
                    end_of_frame();
                } else if (moves == 2 & numred1 == 0 & numyellow != 0 & choice2 == 0) {
                    Player2 = Player2 + yellow;
                    numyellow = 0;
                    lastball = 0;
                    in2++;
                    nyellow.setText(String.valueOf(numyellow));
                    info.setText("Second player move");

                    addlist();
                    middle_of_frame();
                    end_of_frame();
                } else if (moves == 1 & numred == 0 & lastball == 1 & numyellow != 0 & choice2 == 0) {
                    Player1 = Player1 + yellow;
                    numred1 = 0;
                    lastball = 0;
                    in1++;
                    info.setText("First player move");

                    addlist();
                    middle_of_frame();
                    end_of_frame();
                } else if (moves == 2 & numred == 0 & lastball == 1 & numyellow != 0 & choice2 == 0) {
                    Player2 = Player2 + yellow;
                    numred1 = 0;
                    lastball = 0;
                    in2++;
                    info.setText("Second player move");

                    addlist();
                    middle_of_frame();
                    end_of_frame();
                } else if (moves == 1 & numred == 0 & lastball == 0 & numyellow != 0 & choice2 == 0) {
                    Player1 = Player1 + yellow;
                    numred1 = 0;
                    numyellow = 0;
                    in1++;
                    nyellow.setText(String.valueOf(numyellow));
                    info.setText("First player move");

                    addlist();
                    middle_of_frame();
                    end_of_frame();
                } else if (moves == 2 & numred == 0 & lastball == 0 & numyellow != 0 & choice2 == 0) {
                    Player2 = Player2 + yellow;
                    numred1 = 0;
                    numyellow = 0;
                    in2++;
                    nyellow.setText(String.valueOf(numyellow));
                    info.setText("Second player move");

                    addlist();
                    middle_of_frame();
                    end_of_frame();
                } else if (moves == 1 & numred > 0 & lastball == 0 & choice2 == 1) {
                    Player1 = Player1 + red;
                    lastball = 1;
                    in1++;
                    choice2 = 0;
                    info.setText("First player move");

                    addlist();
                    middle_of_frame();
                    end_of_frame();
                } else if (moves == 2 & numred > 0 & lastball == 0 & choice2 == 1) {
                    Player2 = Player2 + red;
                    lastball = 1;
                    in2++;
                    choice2 = 0;
                    info.setText("Second player move");

                    addlist();
                    middle_of_frame();
                    end_of_frame();
                }
            }
        });
        greenbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                v.startAnimation(scale);
                if (moves == 1 & numred > 0 & lastball == 1 & choice2 == 0) {
                    Player1 = Player1 + green;
                    lastball = 2;
                    in1++;
                    info.setText("First player move");

                    addlist();
                    middle_of_frame();
                    end_of_frame();
                } else if (moves == 2 & numred > 0 & lastball == 1 & choice2 == 0) {
                    Player2 = Player2 + green;
                    lastball = 2;
                    in2++;
                    info.setText("Second player move");

                    addlist();
                    middle_of_frame();
                    end_of_frame();
                } else if (moves == 1 & numred > 0 & lastball != 1 & choice2 == 0) {
                    Player2 = Player2 + penalty;
                    lastball = 0;
                    moves = 2;
                    out1++;
                    info.setText("Second player move");

                    addlist();
                    middle_of_frame();
                    end_of_frame();
                } else if (moves == 2 & numred > 0 & lastball != 1 & choice2 == 0) {
                    Player1 = Player1 + penalty;
                    lastball = 0;
                    moves = 1;
                    out2++;
                    info.setText("First player move");

                    addlist();
                    middle_of_frame();
                    end_of_frame();
                } else if (moves == 1 & numred1 == 0 & numyellow == 0 & numgreen != 0 & choice2 == 0) {
                    Player1 = Player1 + green;
                    numgreen = 0;
                    lastball = 0;
                    in1++;
                    ngreen.setText(String.valueOf(numgreen));
                    info.setText("First player move");

                    addlist();
                    middle_of_frame();
                    end_of_frame();
                } else if (moves == 1 & numred1 == 0 & numyellow != 0 & numgreen != 0 & choice2 == 0) {
                    Player2 = Player2 + penalty;
                    lastball = 0;
                    moves = 2;
                    out1++;
                    info.setText("Second player move");

                    addlist();
                    middle_of_frame();
                    end_of_frame();
                } else if (moves == 2 & numred1 == 0 & numyellow == 0 & numgreen != 0 & choice2 == 0) {
                    Player2 = Player2 + green;
                    numgreen = 0;
                    lastball = 0;
                    in2++;
                    ngreen.setText(String.valueOf(numgreen));
                    info.setText("Second player move");

                    addlist();
                    middle_of_frame();
                    end_of_frame();
                } else if (moves == 2 & numred1 == 0 & numyellow != 0 & numgreen != 0 & choice2 == 0) {
                    Player1 = Player1 + penalty;
                    lastball = 0;
                    moves = 1;
                    out2++;
                    info.setText("First player move");

                    addlist();
                    middle_of_frame();
                    end_of_frame();
                } else if (moves == 1 & numred == 0 & lastball == 1 & numgreen != 0 & choice2 == 0) {
                    Player1 = Player1 + green;
                    numred1 = 0;
                    lastball = 0;
                    in1++;
                    info.setText("First player move");

                    addlist();
                    middle_of_frame();
                    end_of_frame();
                } else if (moves == 2 & numred == 0 & lastball == 1 & numgreen != 0 & choice2 == 0) {
                    Player2 = Player2 + green;
                    numred1 = 0;
                    lastball = 0;
                    in2++;
                    info.setText("Second player move");

                    addlist();
                    middle_of_frame();
                    end_of_frame();
                } else if (moves == 1 & numred == 0 & lastball != 1 & numgreen != 0 & numyellow != 0 & choice2 == 0) {
                    Player2 = Player2 + penalty;
                    numred1 = 0;
                    lastball = 0;
                    moves = 2;
                    out1++;
                    info.setText("Second player move");

                    addlist();
                    middle_of_frame();
                    end_of_frame();
                } else if (moves == 2 & numred == 0 & lastball != 1 & numgreen != 0 & numyellow != 0 & choice2 == 0) {
                    Player1 = Player1 + penalty;
                    numred1 = 0;
                    lastball = 0;
                    moves = 1;
                    out2++;
                    info.setText("First player move");

                    addlist();
                    middle_of_frame();
                    end_of_frame();
                } else if (moves == 1 & numred > 0 & lastball == 0 & choice2 == 1) {
                    Player1 = Player1 + red;
                    lastball = 1;
                    in1++;
                    choice2 = 0;
                    info.setText("First player move");

                    addlist();
                    middle_of_frame();
                    end_of_frame();
                } else if (moves == 2 & numred > 0 & lastball == 0 & choice2 == 1) {
                    Player2 = Player2 + red;
                    lastball = 1;
                    in2++;
                    choice2 = 0;
                    info.setText("Second player move");

                    addlist();
                    middle_of_frame();
                    end_of_frame();
                } else if (moves == 1 & numred == 0 & lastball == 0 & numyellow != 0 & choice2 == 1) {
                    Player1 = Player1 + yellow;
                    numred1 = 0;
                    lastball = 0;
                    in1++;
                    choice2 = 0;
                    info.setText("First player move");
                    nyellow.setText(String.valueOf(numyellow));

                    addlist();
                    middle_of_frame();
                    end_of_frame();
                } else if (moves == 2 & numred == 0 & lastball == 0 & numyellow != 0 & choice2 == 1) {
                    Player2 = Player2 + yellow;
                    numred1 = 0;
                    lastball = 0;
                    in2++;
                    choice2 = 0;
                    info.setText("Second player move");
                    nyellow.setText(String.valueOf(numyellow));

                    addlist();
                    middle_of_frame();
                    end_of_frame();
                }
            }
        });
        brownbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                v.startAnimation(scale);
                if (moves == 1 & numred > 0 & lastball == 1 & choice2 == 0) {
                    Player1 = Player1 + brown;
                    lastball = 2;
                    in1++;
                    info.setText("First player move");

                    addlist();
                    middle_of_frame();
                    end_of_frame();
                } else if (moves == 2 & numred > 0 & lastball == 1 & choice2 == 0) {
                    Player2 = Player2 + brown;
                    lastball = 2;
                    in2++;
                    info.setText("Second player move");

                    addlist();
                    middle_of_frame();
                    end_of_frame();
                } else if (moves == 1 & numred > 0 & lastball != 1 & choice2 == 0) {
                    Player2 = Player2 + penalty;
                    lastball = 0;
                    moves = 2;
                    out1++;
                    info.setText("Second player move");

                    addlist();
                    middle_of_frame();
                    end_of_frame();
                } else if (moves == 2 & numred > 0 & lastball != 1 & choice2 == 0) {
                    Player1 = Player1 + penalty;
                    lastball = 0;
                    moves = 1;
                    out2++;
                    info.setText("First player move");

                    addlist();
                    middle_of_frame();
                    end_of_frame();
                } else if (moves == 1 & numred1 == 0 & numgreen == 0 & numbrown != 0 & choice2 == 0) {
                    Player1 = Player1 + brown;
                    numbrown = 0;
                    lastball = 0;
                    in1++;
                    nbrown.setText(String.valueOf(numbrown));
                    info.setText("First player move");

                    addlist();
                    middle_of_frame();
                    end_of_frame();
                } else if (moves == 1 & numred1 == 0 & numgreen != 0 & numbrown != 0 & choice2 == 0) {
                    Player2 = Player2 + penalty;
                    lastball = 0;
                    moves = 2;
                    out1++;
                    info.setText("Second player move");

                    addlist();
                    middle_of_frame();
                    end_of_frame();
                } else if (moves == 2 & numred1 == 0 & numgreen == 0 & numbrown != 0 & choice2 == 0) {
                    Player2 = Player2 + brown;
                    numbrown = 0;
                    lastball = 0;
                    in2++;
                    nbrown.setText(String.valueOf(numbrown));
                    info.setText("Second player move");

                    addlist();
                    middle_of_frame();
                    end_of_frame();
                } else if (moves == 2 & numred1 == 0 & numgreen != 0 & numbrown != 0 & choice2 == 0) {
                    Player1 = Player1 + penalty;
                    lastball = 0;
                    moves = 1;
                    out2++;
                    info.setText("First player move");

                    addlist();
                    middle_of_frame();
                    end_of_frame();
                } else if (moves == 1 & numred == 0 & lastball == 1 & numbrown != 0 & choice2 == 0) {
                    Player1 = Player1 + brown;
                    numred1 = 0;
                    lastball = 0;
                    in1++;
                    info.setText("First player move");

                    addlist();
                    middle_of_frame();
                    end_of_frame();
                } else if (moves == 2 & numred == 0 & lastball == 1 & numbrown != 0 & choice2 == 0) {
                    Player2 = Player2 + brown;
                    numred1 = 0;
                    lastball = 0;
                    in2++;
                    info.setText("Second player move");

                    addlist();
                    middle_of_frame();
                    end_of_frame();
                } else if (moves == 1 & numred == 0 & lastball != 1 & numbrown != 0 & numgreen != 0 & choice2 == 0) {
                    Player2 = Player2 + penalty;
                    numred1 = 0;
                    lastball = 0;
                    moves = 2;
                    out1++;
                    info.setText("Second player move");

                    addlist();
                    middle_of_frame();
                    end_of_frame();
                } else if (moves == 2 & numred == 0 & lastball != 1 & numbrown != 0 & numgreen != 0 & choice2 == 0) {
                    Player1 = Player1 + penalty;
                    numred1 = 0;
                    lastball = 0;
                    moves = 1;
                    out2++;
                    info.setText("First player move");

                    addlist();
                    middle_of_frame();
                    end_of_frame();
                } else if (moves == 1 & numred > 0 & lastball == 0 & choice2 == 1) {
                    Player1 = Player1 + red;
                    lastball = 1;
                    in1++;
                    choice2 = 0;
                    info.setText("First player move");

                    addlist();
                    middle_of_frame();
                    end_of_frame();
                } else if (moves == 2 & numred > 0 & lastball == 0 & choice2 == 1) {
                    Player2 = Player2 + red;
                    lastball = 1;
                    in2++;
                    choice2 = 0;
                    info.setText("Second player move");

                    addlist();
                    middle_of_frame();
                    end_of_frame();
                } else if (moves == 1 & numred == 0 & lastball == 0 & numyellow != 0 & choice2 == 1) {
                    Player1 = Player1 + yellow;
                    numred1 = 0;
                    lastball = 0;
                    in1++;
                    choice2 = 0;
                    info.setText("First player move");
                    nyellow.setText(String.valueOf(numyellow));

                    addlist();
                    middle_of_frame();
                    end_of_frame();
                } else if (moves == 2 & numred == 0 & lastball == 0 & numyellow != 0 & choice2 == 1) {
                    Player2 = Player2 + yellow;
                    numred1 = 0;
                    lastball = 0;
                    in2++;
                    choice2 = 0;
                    info.setText("Second player move");
                    nyellow.setText(String.valueOf(numyellow));

                    addlist();
                    middle_of_frame();
                    end_of_frame();
                } else if (moves == 1 & numred == 0 & lastball == 0 & numyellow == 0 & numgreen != 0 & choice2 == 1) {
                    Player1 = Player1 + green;
                    numred1 = 0;
                    lastball = 0;
                    in1++;
                    choice2 = 0;
                    info.setText("First player move");
                    ngreen.setText(String.valueOf(numgreen));

                    addlist();
                    middle_of_frame();
                    end_of_frame();
                } else if (moves == 2 & numred == 0 & lastball == 0 & numyellow == 0 & numgreen != 0 & choice2 == 1) {
                    Player2 = Player2 + green;
                    numred1 = 0;
                    lastball = 0;
                    in2++;
                    choice2 = 0;
                    info.setText("Second player move");
                    ngreen.setText(String.valueOf(numgreen));

                    addlist();
                    middle_of_frame();
                    end_of_frame();
                }
            }
        });
        bluebtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                v.startAnimation(scale);
                if (moves == 1 & numred > 0 & lastball == 1 & choice2 == 0) {
                    Player1 = Player1 + blue;
                    lastball = 2;
                    in1++;
                    info.setText("First player move");

                    addlist();
                    middle_of_frame();
                    end_of_frame();
                } else if (moves == 2 & numred > 0 & lastball == 1 & choice2 == 0) {
                    Player2 = Player2 + blue;
                    lastball = 2;
                    in2++;
                    info.setText("Second player move");

                    addlist();
                    middle_of_frame();
                    end_of_frame();
                } else if (moves == 1 & numred > 0 & lastball != 1 & choice2 == 0) {
                    Player2 = Player2 + penalty2;
                    lastball = 0;
                    moves = 2;
                    out1++;
                    info.setText("Second player move");

                    addlist();
                    middle_of_frame();
                    end_of_frame();
                } else if (moves == 2 & numred > 0 & lastball != 1 & choice2 == 0) {
                    Player1 = Player1 + penalty2;
                    lastball = 0;
                    moves = 1;
                    out2++;
                    info.setText("First player move");

                    addlist();
                    middle_of_frame();
                    end_of_frame();
                } else if (moves == 1 & numred1 == 0 & numbrown == 0 & numblue != 0 & choice2 == 0) {
                    Player1 = Player1 + blue;
                    numblue = 0;
                    lastball = 0;
                    in1++;
                    nblue.setText(String.valueOf(numblue));
                    info.setText("First player move");

                    addlist();
                    middle_of_frame();
                    end_of_frame();
                } else if (moves == 1 & numred1 == 0 & numbrown != 0 & numblue != 0 & choice2 == 0) {
                    Player2 = Player2 + penalty2;
                    lastball = 0;
                    moves = 2;
                    out1++;
                    info.setText("Second player move");

                    addlist();
                    middle_of_frame();
                    end_of_frame();
                } else if (moves == 2 & numred1 == 0 & numbrown == 0 & numblue != 0 & choice2 == 0) {
                    Player2 = Player2 + blue;
                    numblue = 0;
                    lastball = 0;
                    in2++;
                    nblue.setText(String.valueOf(numblue));
                    info.setText("Second player move");

                    addlist();
                    middle_of_frame();
                    end_of_frame();
                } else if (moves == 2 & numred1 == 0 & numbrown != 0 & numblue != 0 & choice2 == 0) {
                    Player1 = Player1 + penalty2;
                    lastball = 0;
                    moves = 1;
                    out2++;
                    info.setText("First player move");

                    addlist();
                    middle_of_frame();
                    end_of_frame();
                } else if (moves == 1 & numred == 0 & lastball == 1 & numblue != 0 & choice2 == 0) {
                    Player1 = Player1 + blue;
                    numred1 = 0;
                    lastball = 0;
                    in1++;
                    info.setText("First player move");

                    addlist();
                    middle_of_frame();
                    end_of_frame();
                } else if (moves == 2 & numred == 0 & lastball == 1 & numblue != 0 & choice2 == 0) {
                    Player2 = Player2 + blue;
                    numred1 = 0;
                    lastball = 0;
                    in2++;
                    info.setText("Second player move");

                    addlist();
                    middle_of_frame();
                    end_of_frame();
                } else if (moves == 1 & numred == 0 & lastball != 1 & numblue != 0 & numbrown != 0 & choice2 == 0) {
                    Player2 = Player2 + penalty2;
                    numred1 = 0;
                    lastball = 0;
                    moves = 2;
                    out1++;
                    info.setText("Second player move");

                    addlist();
                    middle_of_frame();
                    end_of_frame();
                } else if (moves == 2 & numred == 0 & lastball != 1 & numblue != 0 & numbrown != 0 & choice2 == 0) {
                    Player1 = Player1 + penalty2;
                    numred1 = 0;
                    lastball = 0;
                    moves = 1;
                    out2++;
                    info.setText("First player move");

                    addlist();
                    middle_of_frame();
                    end_of_frame();
                } else if (moves == 1 & numred > 0 & lastball == 0 & choice2 == 1) {
                    Player1 = Player1 + red;
                    lastball = 1;
                    in1++;
                    choice2 = 0;
                    info.setText("First player move");

                    addlist();
                    middle_of_frame();
                    end_of_frame();
                } else if (moves == 2 & numred > 0 & lastball == 0 & choice2 == 1) {
                    Player2 = Player2 + red;
                    lastball = 1;
                    in2++;
                    choice2 = 0;
                    info.setText("Second player move");

                    addlist();
                    middle_of_frame();
                    end_of_frame();
                } else if (moves == 1 & numred == 0 & lastball == 0 & numyellow != 0 & choice2 == 1) {
                    Player1 = Player1 + yellow;
                    numred1 = 0;
                    lastball = 0;
                    in1++;
                    choice2 = 0;
                    info.setText("First player move");
                    nyellow.setText(String.valueOf(numyellow));

                    addlist();
                    middle_of_frame();
                    end_of_frame();
                } else if (moves == 2 & numred == 0 & lastball == 0 & numyellow != 0 & choice2 == 1) {
                    Player2 = Player2 + yellow;
                    numred1 = 0;
                    lastball = 0;
                    in2++;
                    choice2 = 0;
                    info.setText("Second player move");
                    nyellow.setText(String.valueOf(numyellow));

                    addlist();
                    middle_of_frame();
                    end_of_frame();
                } else if (moves == 1 & numred == 0 & lastball == 0 & numyellow == 0 & numgreen != 0 & choice2 == 1) {
                    Player1 = Player1 + green;
                    numred1 = 0;
                    lastball = 0;
                    in1++;
                    choice2 = 0;
                    info.setText("First player move");
                    ngreen.setText(String.valueOf(numgreen));

                    addlist();
                    middle_of_frame();
                    end_of_frame();
                } else if (moves == 2 & numred == 0 & lastball == 0 & numyellow == 0 & numgreen != 0 & choice2 == 1) {
                    Player2 = Player2 + green;
                    numred1 = 0;
                    lastball = 0;
                    in2++;
                    choice2 = 0;
                    info.setText("Second player move");
                    ngreen.setText(String.valueOf(numgreen));

                    addlist();
                    middle_of_frame();
                    end_of_frame();
                } else if (moves == 1 & numred == 0 & lastball == 0 & numgreen == 0 & numbrown != 0 & choice2 == 1) {
                    Player1 = Player1 + brown;
                    numred1 = 0;
                    lastball = 0;
                    in1++;
                    choice2 = 0;
                    info.setText("First player move");
                    nbrown.setText(String.valueOf(numbrown));

                    addlist();
                    middle_of_frame();
                    end_of_frame();
                } else if (moves == 2 & numred == 0 & lastball == 0 & numgreen == 0 & numbrown != 0 & choice2 == 1) {
                    Player2 = Player2 + brown;
                    numred1 = 0;
                    lastball = 0;
                    in2++;
                    choice2 = 0;
                    info.setText("Second player move");
                    nbrown.setText(String.valueOf(numbrown));

                    addlist();
                    middle_of_frame();
                    end_of_frame();
                }
            }
        });
        pinkbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                v.startAnimation(scale);
                if (moves == 1 & numred > 0 & lastball == 1 & choice2 == 0) {
                    Player1 = Player1 + pink;
                    lastball = 2;
                    in1++;
                    info.setText("First player move");

                    addlist();
                    middle_of_frame();
                    end_of_frame();
                } else if (moves == 2 & numred > 0 & lastball == 1 & choice2 == 0) {
                    Player2 = Player2 + pink;
                    lastball = 2;
                    in2++;
                    info.setText("Second player move");

                    addlist();
                    middle_of_frame();
                    end_of_frame();
                } else if (moves == 1 & numred > 0 & lastball != 1 & choice2 == 0) {
                    Player2 = Player2 + penalty3;
                    lastball = 0;
                    moves = 2;
                    out1++;
                    info.setText("Second player move");

                    addlist();
                    middle_of_frame();
                    end_of_frame();
                } else if (moves == 2 & numred > 0 & lastball != 1 & choice2 == 0) {
                    Player1 = Player1 + penalty3;
                    lastball = 0;
                    moves = 1;
                    out2++;
                    info.setText("First player move");

                    addlist();
                    middle_of_frame();
                    end_of_frame();
                } else if (moves == 1 & numred1 == 0 & numblue == 0 & numpink != 0 & choice2 == 0) {
                    Player1 = Player1 + pink;
                    numpink = 0;
                    lastball = 0;
                    in1++;
                    npink.setText(String.valueOf(numpink));
                    info.setText("First player move");

                    addlist();
                    middle_of_frame();
                    end_of_frame();
                } else if (moves == 1 & numred1 == 0 & numblue != 0 & numpink != 0 & choice2 == 0) {
                    Player2 = Player2 + penalty3;
                    lastball = 0;
                    moves = 2;
                    out1++;
                    info.setText("Second player move");

                    addlist();
                    middle_of_frame();
                    end_of_frame();
                } else if (moves == 2 & numred1 == 0 & numblue == 0 & numpink != 0 & choice2 == 0) {
                    Player2 = Player2 + pink;
                    numpink = 0;
                    lastball = 0;
                    in2++;
                    npink.setText(String.valueOf(numpink));
                    info.setText("Second player move");

                    addlist();
                    middle_of_frame();
                    end_of_frame();
                } else if (moves == 2 & numred1 == 0 & numblue != 0 & numpink != 0 & choice2 == 0) {
                    Player1 = Player1 + penalty3;
                    lastball = 0;
                    moves = 1;
                    out2++;
                    info.setText("First player move");

                    addlist();
                    middle_of_frame();
                    end_of_frame();
                } else if (moves == 1 & numred == 0 & lastball == 1 & numpink != 0 & choice2 == 0) {
                    Player1 = Player1 + pink;
                    numred1 = 0;
                    lastball = 0;
                    in1++;
                    info.setText("First player move");

                    addlist();
                    middle_of_frame();
                    end_of_frame();
                } else if (moves == 2 & numred == 0 & lastball == 1 & numpink != 0 & choice2 == 0) {
                    Player2 = Player2 + pink;
                    numred1 = 0;
                    lastball = 0;
                    in2++;
                    info.setText("Second player move");

                    addlist();
                    middle_of_frame();
                    end_of_frame();
                } else if (moves == 1 & numred == 0 & lastball != 1 & numpink != 0 & numblue != 0 & choice2 == 0) {
                    Player2 = Player2 + penalty3;
                    numred1 = 0;
                    lastball = 0;
                    moves = 2;
                    out1++;
                    info.setText("Second player move");

                    addlist();
                    middle_of_frame();
                    end_of_frame();
                } else if (moves == 2 & numred == 0 & lastball != 1 & numpink != 0 & numblue != 0 & choice2 == 0) {
                    Player1 = Player1 + penalty3;
                    numred1 = 0;
                    lastball = 0;
                    moves = 1;
                    out2++;
                    info.setText("First player move");

                    addlist();
                    middle_of_frame();
                    end_of_frame();
                } else if (moves == 1 & numred > 0 & lastball == 0 & choice2 == 1) {
                    Player1 = Player1 + red;
                    lastball = 1;
                    in1++;
                    choice2 = 0;
                    info.setText("First player move");

                    addlist();
                    middle_of_frame();
                    end_of_frame();
                } else if (moves == 2 & numred > 0 & lastball == 0 & choice2 == 1) {
                    Player2 = Player2 + red;
                    lastball = 1;
                    in2++;
                    choice2 = 0;
                    info.setText("Second player move");

                    addlist();
                    middle_of_frame();
                    end_of_frame();
                } else if (moves == 1 & numred == 0 & lastball == 0 & numyellow != 0 & choice2 == 1) {
                    Player1 = Player1 + yellow;
                    numred1 = 0;
                    lastball = 0;
                    in1++;
                    choice2 = 0;
                    info.setText("First player move");
                    nyellow.setText(String.valueOf(numyellow));

                    addlist();
                    middle_of_frame();
                    end_of_frame();
                } else if (moves == 2 & numred == 0 & lastball == 0 & numyellow != 0 & choice2 == 1) {
                    Player2 = Player2 + yellow;
                    numred1 = 0;
                    lastball = 0;
                    in2++;
                    choice2 = 0;
                    info.setText("Second player move");
                    nyellow.setText(String.valueOf(numyellow));

                    addlist();
                    middle_of_frame();
                    end_of_frame();
                } else if (moves == 1 & numred == 0 & lastball == 0 & numyellow == 0 & numgreen != 0 & choice2 == 1) {
                    Player1 = Player1 + green;
                    numred1 = 0;
                    lastball = 0;
                    in1++;
                    choice2 = 0;
                    info.setText("First player move");
                    ngreen.setText(String.valueOf(numgreen));

                    addlist();
                    middle_of_frame();
                    end_of_frame();
                } else if (moves == 2 & numred == 0 & lastball == 0 & numyellow == 0 & numgreen != 0 & choice2 == 1) {
                    Player2 = Player2 + green;
                    numred1 = 0;
                    lastball = 0;
                    in2++;
                    choice2 = 0;
                    info.setText("Second player move");
                    ngreen.setText(String.valueOf(numgreen));

                    addlist();
                    middle_of_frame();
                    end_of_frame();
                } else if (moves == 1 & numred == 0 & lastball == 0 & numgreen == 0 & numbrown != 0 & choice2 == 1) {
                    Player1 = Player1 + brown;
                    numred1 = 0;
                    lastball = 0;
                    in1++;
                    choice2 = 0;
                    info.setText("First player move");
                    nbrown.setText(String.valueOf(numbrown));

                    addlist();
                    middle_of_frame();
                    end_of_frame();
                } else if (moves == 2 & numred == 0 & lastball == 0 & numgreen == 0 & numbrown != 0 & choice2 == 1) {
                    Player2 = Player2 + brown;
                    numred1 = 0;
                    lastball = 0;
                    in2++;
                    choice2 = 0;
                    info.setText("Second player move");
                    nbrown.setText(String.valueOf(numbrown));

                    addlist();
                    middle_of_frame();
                    end_of_frame();
                } else if (moves == 1 & numred == 0 & lastball == 0 & numbrown == 0 & numblue != 0 & choice2 == 1) {
                    Player1 = Player1 + blue;
                    numred1 = 0;
                    lastball = 0;
                    in1++;
                    choice2 = 0;
                    info.setText("First player move");
                    nblue.setText(String.valueOf(numblue));

                    addlist();
                    middle_of_frame();
                    end_of_frame();
                } else if (moves == 2 & numred == 0 & lastball == 0 & numbrown == 0 & numblue != 0 & choice2 == 1) {
                    Player2 = Player2 + blue;
                    numred1 = 0;
                    lastball = 0;
                    in2++;
                    choice2 = 0;
                    info.setText("Second player move");
                    nblue.setText(String.valueOf(numblue));

                    addlist();
                    middle_of_frame();
                    end_of_frame();
                }
            }
        });
        missbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Pl1.setCursorVisible(false);
                Pl2.setCursorVisible(false);
                if (moves == 1) {
                    moves = 2;
                    lastball = 0;
                    out1++;
                    try {
                        accu1 = (float)in1 / ((float)in1 + (float)out1);
                    } catch (ArithmeticException e) {
                    }
                    try {
                        accu2 = (float)in2 / ((float)in2 + (float)out2);
                    } catch (ArithmeticException e) {
                    }
                    if (in1 == 0 & out1 == 0) {
                        accu1 = 0;
                    }
                    if (in2 == 0 & out2 == 0) {
                        accu2 = 0;
                    }
                    info.setText("Second player move");
                    accu1v.setText(format.format(accu1));
                    accu2v.setText(format.format(accu2));

                    addlist();
                } else {
                    moves = 1;
                    lastball =0;
                    out2++;
                    try {
                        accu1 = (float)in1 / ((float)in1 + (float)out1);
                    } catch (ArithmeticException e) {
                    }
                    try {
                        accu2 = (float)in2 / ((float)in2 + (float)out2);
                    } catch (ArithmeticException e) {
                    }
                    if (in1 == 0 & out1 == 0) {
                        accu1 = 0;
                    }
                    if (in2 == 0 & out2 == 0) {
                        accu2 = 0;
                    }
                    info.setText("First player move");
                    accu1v.setText(format.format(accu1));
                    accu2v.setText(format.format(accu2));

                    addlist();
                }
            }
        });
        penaltybtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final String[] foularray = {"4", "5", "6", "7"};
                final String[] foularray2 = {"remove red", "free ball"};
                final boolean[] checkedItemsArray = {false, false};

                AlertDialog.Builder adb2 = new AlertDialog.Builder(MainActivity.this);
                adb2.setTitle("Foul");
                adb2.setCancelable(true);
                adb2.setMultiChoiceItems(foularray2, checkedItemsArray, new DialogInterface.OnMultiChoiceClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which, boolean isChecked) {
                        checkedItemsArray[which] = isChecked;

                    }
                });
                adb2.setPositiveButton("Ok", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        for (int z = 0; z < checkedItemsArray.length - 1; z++) {
                            if (checkedItemsArray[0] == true) {
                                numred = numred - 1;
                                nred.setText(String.valueOf(numred));
                            }
                            if (checkedItemsArray[1] == true) {
                                choice2 = 1;
                                Toast toast = Toast.makeText(getApplicationContext(), "Free ball", Toast.LENGTH_LONG);
                                toast.show();
                            }
                        }
                    }
                });
                adb2.setNegativeButton("Cancle", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.cancel();
                    }
                });
                AlertDialog fl2 = adb2.create();
                adb2.show();

                AlertDialog.Builder adb = new AlertDialog.Builder(MainActivity.this);
                adb.setTitle("Foul");
                adb.setCancelable(true);
                adb.setSingleChoiceItems(foularray, -1, new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        choice = foularray[which];
                    }
                });
                adb.setPositiveButton("Ok", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        if (choice.equals("4") & moves == 1) {
                            Player2 = Player2 + penalty;
                            moves = 2;
                            lastball = 0;
                            out1++;
                            info.setText("Second player move");

                            addlist();
                            middle_of_frame();
                            end_of_frame();
                        } else if (choice.equals("4") & moves == 2) {
                            Player1 = Player1 + penalty;
                            moves = 1;
                            lastball = 0;
                            out2++;
                            info.setText("First player move");

                            addlist();
                            middle_of_frame();
                            end_of_frame();
                        } else if (choice.equals("5") & moves == 1) {
                            Player2 = Player2 + penalty2;
                            moves = 2;
                            lastball = 0;
                            out1++;
                            info.setText("Second player move");

                            addlist();
                            middle_of_frame();
                            end_of_frame();
                        } else if (choice.equals("5") & moves == 2) {
                            Player1 = Player1 + penalty2;
                            moves = 1;
                            lastball = 0;
                            out2++;
                            info.setText("First player move");

                            addlist();
                            middle_of_frame();
                            end_of_frame();
                        } else if (choice.equals("6") & moves == 1) {
                            Player2 = Player2 + penalty3;
                            moves = 2;
                            lastball = 0;
                            out1++;
                            info.setText("Second player move");

                            addlist();
                            middle_of_frame();
                            end_of_frame();
                        } else if (choice.equals("6") & moves == 2) {
                            Player1 = Player1 + penalty3;
                            moves = 1;
                            lastball = 0;
                            out2++;
                            info.setText("First player move");

                            addlist();
                            middle_of_frame();
                            end_of_frame();
                        } else if (choice.equals("7") & moves == 1) {
                            Player2 = Player2 + penalty4;
                            moves = 2;
                            lastball = 0;
                            out1++;
                            info.setText("Second player move");

                            addlist();
                            middle_of_frame();
                            end_of_frame();
                        } else if (choice.equals("7") & moves == 2) {
                            Player1 = Player1 + penalty4;
                            moves = 1;
                            lastball = 0;
                            out2++;
                            info.setText("First player move");

                            addlist();
                            middle_of_frame();
                            end_of_frame();
                        }
                    }
                });
                adb.setNegativeButton("Cancle", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.cancel();
                    }
                });
                AlertDialog fl = adb.create();
                adb.show();
            }
        });
        newgamebtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if ((Player2 + NumOfPoints) < Player1) {
                    NumOfWinsP1++;
                    Player1 = 0;
                    Player2 = 0;
                    lastball = 0;
                    numred = 15;
                    numred1 = 1;
                    numyellow = 1;
                    numgreen = 1;
                    numbrown = 1;
                    numblue = 1;
                    numpink = 1;
                    numblack = 1;
                    numblack1 = 0;
                    try {
                        accu1 = (float)in1 / ((float)in1 + (float)out1);
                    } catch (ArithmeticException e) {
                    }
                    try {
                        accu2 = (float)in2 / ((float)in2 + (float)out2);
                    } catch (ArithmeticException e) {
                    }
                    if (in1 == 0 & out1 == 0) {
                        accu1 = 0;
                    }
                    if (in2 == 0 & out2 == 0) {
                        accu2 = 0;
                    }
                    P1P2 = Player1 - Player2;
                    P2P1 = Player2 - Player1;
                    NumOfPoints = numred * red + numred * black + numyellow * yellow + numgreen * green + numbrown * brown + numblue * blue + numpink * pink + numblack * black;
                    gamepl1.setText(String.valueOf(NumOfWinsP1));
                    gamepl2.setText(String.valueOf(NumOfWinsP2));
                    countpl1.setText(String.valueOf(Player1));
                    countpl2.setText(String.valueOf(Player2));
                    p1p2.setText(String.valueOf(P1P2));
                    p2p1.setText(String.valueOf(P2P1));
                    ontable.setText(String.valueOf(NumOfPoints));
                    nred.setText(String.valueOf(numred));
                    nblack.setText(String.valueOf(numblack));
                    nyellow.setText(String.valueOf(numyellow));
                    ngreen.setText(String.valueOf(numgreen));
                    nbrown.setText(String.valueOf(numbrown));
                    nblue.setText(String.valueOf(numblue));
                    npink.setText(String.valueOf(numpink));
                    accu1v.setText(format.format(accu1));
                    accu2v.setText(format.format(accu2));
                    if (whosfirst == 1) {
                        whosfirst = 2;
                        moves = 2;
                        info.setText("Second player move");
                    } else {
                        whosfirst = 1;
                        moves = 1;
                        info.setText("First player move");
                    }
                    addlist();
                } else if ((Player1 + NumOfPoints) < Player2) {
                    NumOfWinsP2++;
                    Player1 = 0;
                    Player2 = 0;
                    lastball = 0;
                    numred = 15;
                    numred1 = 1;
                    numyellow = 1;
                    numgreen = 1;
                    numbrown = 1;
                    numblue = 1;
                    numpink = 1;
                    numblack = 1;
                    numblack1 = 0;
                    try {
                        accu1 = (float)in1 / ((float)in1 + (float)out1);
                    } catch (ArithmeticException e) {
                    }
                    try {
                        accu2 = (float)in2 / ((float)in2 + (float)out2);
                    } catch (ArithmeticException e) {
                    }
                    if (in1 == 0 & out1 == 0) {
                        accu1 = 0;
                    }
                    if (in2 == 0 & out2 == 0) {
                        accu2 = 0;
                    }
                    P1P2 = Player1 - Player2;
                    P2P1 = Player2 - Player1;
                    NumOfPoints = numred * red + numred * black + numyellow * yellow + numgreen * green + numbrown * brown + numblue * blue + numpink * pink + numblack * black;
                    gamepl1.setText(String.valueOf(NumOfWinsP1));
                    gamepl2.setText(String.valueOf(NumOfWinsP2));
                    countpl1.setText(String.valueOf(Player1));
                    countpl2.setText(String.valueOf(Player2));
                    p1p2.setText(String.valueOf(P1P2));
                    p2p1.setText(String.valueOf(P2P1));
                    ontable.setText(String.valueOf(NumOfPoints));
                    nred.setText(String.valueOf(numred));
                    nblack.setText(String.valueOf(numblack));
                    nyellow.setText(String.valueOf(numyellow));
                    ngreen.setText(String.valueOf(numgreen));
                    nbrown.setText(String.valueOf(numbrown));
                    nblue.setText(String.valueOf(numblue));
                    npink.setText(String.valueOf(numpink));
                    accu1v.setText(format.format(accu1));
                    accu2v.setText(format.format(accu2));
                    if (whosfirst == 1) {
                        whosfirst = 2;
                        moves = 2;
                        info.setText("Second player move");
                    } else {
                        whosfirst = 1;
                        moves = 1;
                        info.setText("First player move");
                    }
                    addlist();
                }
            }
        });
        clearbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                NumOfWinsP1 = 0;
                NumOfWinsP2 = 0;
                Player1 = 0;
                Player2 = 0;
                numred = 15;
                numred1 = 1;
                numyellow = 1;
                numgreen = 1;
                numbrown = 1;
                numblue = 1;
                numpink = 1;
                numblack = 1;
                numblack1 = 0;
                in1 = 0;
                in2 = 0;
                out1 = 0;
                out2 = 0;
                accu1 = 0;
                accu2 = 0;
                try {
                    accu1 = (float)in1 / ((float)in1 + (float)out1);
                } catch (ArithmeticException e) {
                }
                try {
                    accu2 = (float)in2 / ((float)in2 + (float)out2);
                } catch (ArithmeticException e) {
                }
                if (in1 == 0 & out1 == 0) {
                    accu1 = 0;
                }
                if (in2 == 0 & out2 == 0) {
                    accu2 = 0;
                }
                P1P2 = Player1 - Player2;
                P2P1 = Player2 - Player1;
                NumOfPoints = numred * red + numred * black + numyellow * yellow + numgreen * green + numbrown * brown + numblue * blue + numpink * pink + numblack * black;
                moves = 1;
                whosfirst = 1;
                lastball = 0;
                gamepl1.setText(String.valueOf(NumOfWinsP1));
                gamepl2.setText(String.valueOf(NumOfWinsP2));
                countpl1.setText(String.valueOf(Player1));
                countpl2.setText(String.valueOf(Player2));
                p1p2.setText(String.valueOf(P1P2));
                p2p1.setText(String.valueOf(P2P1));
                ontable.setText(String.valueOf(NumOfPoints));
                info.setText("First player move");
                nred.setText(String.valueOf(numred));
                nblack.setText(String.valueOf(numblack));
                nyellow.setText(String.valueOf(numyellow));
                ngreen.setText(String.valueOf(numgreen));
                nbrown.setText(String.valueOf(numbrown));
                nblue.setText(String.valueOf(numblue));
                npink.setText(String.valueOf(numpink));
                accu1v.setText(format.format(accu1));
                accu2v.setText(format.format(accu2));

                addlist();
            }
        });
        undobtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (now1list.size() == 1) {
                    NumOfWinsP1 = 0;
                    NumOfWinsP2 = 0;
                    Player1 = 0;
                    Player2 = 0;
                    numred = 15;
                    numred1 = 1;
                    numyellow = 1;
                    numgreen = 1;
                    numbrown = 1;
                    numblue = 1;
                    numpink = 1;
                    numblack = 1;
                    numblack1 = 0;
                    moves = 1;
                    whosfirst = 1;
                    lastball = 0;
                    in1 = 0;
                    in2 = 0;
                    out1 = 0;
                    out2 = 0;
                    choice2 = 0;
                    try {
                        accu1 = (float)in1 / ((float)in1 + (float)out1);
                    } catch (ArithmeticException e) {
                    }
                    try {
                        accu2 = (float)in2 / ((float)in2 + (float)out2);
                    } catch (ArithmeticException e) {
                    }
                    if (in1 == 0 & out1 == 0) {
                        accu1 = 0;
                    }
                    if (in2 == 0 & out2 == 0) {
                        accu2 = 0;
                    }
                    P1P2 = Player1 - Player2;
                    P2P1 = Player2 - Player1;
                    NumOfPoints = numred * red + numred * black + numyellow * yellow + numgreen * green + numbrown * brown + numblue * blue + numpink * pink + numblack * black;
                    gamepl1.setText(String.valueOf(NumOfWinsP1));
                    gamepl2.setText(String.valueOf(NumOfWinsP2));
                    countpl1.setText(String.valueOf(Player1));
                    countpl2.setText(String.valueOf(Player2));
                    p1p2.setText(String.valueOf(P1P2));
                    p2p1.setText(String.valueOf(P2P1));
                    ontable.setText(String.valueOf(NumOfPoints));
                    nred.setText(String.valueOf(numred));
                    nblack.setText(String.valueOf(numblack));
                    nyellow.setText(String.valueOf(numyellow));
                    ngreen.setText(String.valueOf(numgreen));
                    nbrown.setText(String.valueOf(numbrown));
                    nblue.setText(String.valueOf(numblue));
                    npink.setText(String.valueOf(numpink));
                    info.setText("First player move");
                } else {
                    now1list.removeLast();
                    now2list.removeLast();
                    pl1list.removeLast();
                    pl2list.removeLast();
                    nredlist.removeLast();
                    nred1list.removeLast();
                    nyellowlist.removeLast();
                    ngreenlist.removeLast();
                    nbrownlist.removeLast();
                    nbluelist.removeLast();
                    npinklist.removeLast();
                    nblacklist.removeLast();
                    nblack1list.removeLast();
                    moveslist.removeLast();
                    lastblist.removeLast();
                    whosfirstlist.removeLast();
                    in1list.removeLast();
                    in2list.removeLast();
                    out1list.removeLast();
                    out2list.removeLast();
                    choice2list.removeLast();
                    NumOfWinsP1 = now1list.peekLast();
                    NumOfWinsP2 = now2list.peekLast();
                    Player1 = pl1list.peekLast();
                    Player2 = pl2list.peekLast();
                    numred = nredlist.peekLast();
                    numred1 = nred1list.peekLast();
                    numyellow = nyellowlist.peekLast();
                    numgreen = ngreenlist.peekLast();
                    numbrown = nbrownlist.peekLast();
                    numblue = nbluelist.peekLast();
                    numpink = npinklist.peekLast();
                    numblack = nblacklist.peekLast();
                    numblack1 = nblack1list.peekLast();
                    in1 = in1list.peekLast();
                    in2 = in2list.peekLast();
                    out1 = out1list.peekLast();
                    out2 = out2list.peekLast();
                    choice2 = choice2list.peekLast();
                    try {
                        accu1 = (float)in1 / ((float)in1 + (float)out1);
                    } catch (ArithmeticException e) {
                    }
                    try {
                        accu2 = (float)in2 / ((float)in2 + (float)out2);
                    } catch (ArithmeticException e) {
                    }
                    if (in1 == 0 & out1 == 0) {
                        accu1 = 0;
                    }
                    if (in2 == 0 & out2 == 0) {
                        accu2 = 0;
                    }
                    P1P2 = Player1 - Player2;
                    P2P1 = Player2 - Player1;
                    NumOfPoints = numred * red + numred * black + numyellow * yellow + numgreen * green + numbrown * brown + numblue * blue + numpink * pink + numblack * black;
                    moves = moveslist.peekLast();
                    whosfirst = whosfirstlist.peekLast();
                    lastball = lastblist.peekLast();
                    gamepl1.setText(String.valueOf(NumOfWinsP1));
                    gamepl2.setText(String.valueOf(NumOfWinsP2));
                    countpl1.setText(String.valueOf(Player1));
                    countpl2.setText(String.valueOf(Player2));
                    p1p2.setText(String.valueOf(P1P2));
                    p2p1.setText(String.valueOf(P2P1));
                    ontable.setText(String.valueOf(NumOfPoints));
                    nred.setText(String.valueOf(numred));
                    nblack.setText(String.valueOf(numblack));
                    nyellow.setText(String.valueOf(numyellow));
                    ngreen.setText(String.valueOf(numgreen));
                    nbrown.setText(String.valueOf(numbrown));
                    nblue.setText(String.valueOf(numblue));
                    npink.setText(String.valueOf(numpink));

                    if (moves == 1) {
                        info.setText("First player move");
                    } else {
                        info.setText("Second player move");
                    }
                }
            }
        });
    }

    @Override
    protected void onSaveInstanceState(@NonNull Bundle outState) {
        super.onSaveInstanceState(outState);

        outState.putInt(KEY_COUNT, NumOfWinsP1);
        outState.putInt(KEY_COUNT1, NumOfWinsP2);
        outState.putInt(KEY_COUNT2, Player1);
        outState.putInt(KEY_COUNT3, Player2);
        outState.putInt(KEY_COUNT4, moves);
        outState.putInt(KEY_COUNT5, lastball);
        outState.putInt(KEY_COUNT6, whosfirst);
        outState.putInt(KEY_COUNT7, numred);
        outState.putInt(KEY_COUNT8, numblack);
        outState.putInt(KEY_COUNT9, numyellow);
        outState.putInt(KEY_COUNT10, numgreen);
        outState.putInt(KEY_COUNT11, numbrown);
        outState.putInt(KEY_COUNT12, numblue);
        outState.putInt(KEY_COUNT13, numpink);
        outState.putInt(KEY_COUNT14, numred1);
        outState.putInt(KEY_COUNT15, numblack1);
        outState.putInt(KEY_COUNT32, in1);
        outState.putInt(KEY_COUNT33, in2);
        outState.putInt(KEY_COUNT34, out1);
        outState.putInt(KEY_COUNT35, out2);
        outState.putInt(KEY_COUNT40, image);
        outState.putInt(KEY_COUNT41, image2);
        outState.putInt(KEY_COUNT42, choice2);
        outState.putInt(KEY_COUNT44, P1P2);
        outState.putInt(KEY_COUNT45, P2P1);
        ArrayList<Integer> now1arlist = new ArrayList<>(now1list);
        ArrayList<Integer> now2arlist = new ArrayList<>(now2list);
        ArrayList<Integer> pl1arlist = new ArrayList<>(pl1list);
        ArrayList<Integer> pl2arlist = new ArrayList<>(pl2list);
        ArrayList<Integer> nredarlist = new ArrayList<>(nredlist);
        ArrayList<Integer> nred1arlist = new ArrayList<>(nred1list);
        ArrayList<Integer> nblackarlist = new ArrayList<>(nblacklist);
        ArrayList<Integer> nblack1arlist = new ArrayList<>(nblack1list);
        ArrayList<Integer> nyellowarlist = new ArrayList<>(nyellowlist);
        ArrayList<Integer> ngreenarlist = new ArrayList<>(ngreenlist);
        ArrayList<Integer> nbrownarlist = new ArrayList<>(nbrownlist);
        ArrayList<Integer> nbluearlist = new ArrayList<>(nbluelist);
        ArrayList<Integer> npinkarlist = new ArrayList<>(npinklist);
        ArrayList<Integer> movesarlist = new ArrayList<>(moveslist);
        ArrayList<Integer> lastbarlist = new ArrayList<>(lastblist);
        ArrayList<Integer> whosfirstarlist = new ArrayList<>(whosfirstlist);
        ArrayList<Integer> in1arlist = new ArrayList<>(in1list);
        ArrayList<Integer> in2arlist = new ArrayList<>(in2list);
        ArrayList<Integer> out1arlist = new ArrayList<>(out1list);
        ArrayList<Integer> out2arlist = new ArrayList<>(out2list);
        ArrayList<Integer> choice2arlist = new ArrayList<>(choice2list);
        ArrayList<Integer> p1p2arlist = new ArrayList<>(p1p2list);
        ArrayList<Integer> p2p1arlist = new ArrayList<>(p2p1list);
        outState.putIntegerArrayList(KEY_COUNT16, now1arlist);
        outState.putIntegerArrayList(KEY_COUNT17, now2arlist);
        outState.putIntegerArrayList(KEY_COUNT18, pl1arlist);
        outState.putIntegerArrayList(KEY_COUNT19, pl2arlist);
        outState.putIntegerArrayList(KEY_COUNT20, movesarlist);
        outState.putIntegerArrayList(KEY_COUNT21, lastbarlist);
        outState.putIntegerArrayList(KEY_COUNT22, whosfirstarlist);
        outState.putIntegerArrayList(KEY_COUNT23, nredarlist);
        outState.putIntegerArrayList(KEY_COUNT24, nred1arlist);
        outState.putIntegerArrayList(KEY_COUNT25, nyellowarlist);
        outState.putIntegerArrayList(KEY_COUNT26, ngreenarlist);
        outState.putIntegerArrayList(KEY_COUNT27, nbrownarlist);
        outState.putIntegerArrayList(KEY_COUNT28, nbluearlist);
        outState.putIntegerArrayList(KEY_COUNT29, npinkarlist);
        outState.putIntegerArrayList(KEY_COUNT30, nblackarlist);
        outState.putIntegerArrayList(KEY_COUNT31, nblack1arlist);
        outState.putIntegerArrayList(KEY_COUNT36, in1arlist);
        outState.putIntegerArrayList(KEY_COUNT37, in2arlist);
        outState.putIntegerArrayList(KEY_COUNT38, out1arlist);
        outState.putIntegerArrayList(KEY_COUNT39, out2arlist);
        outState.putIntegerArrayList(KEY_COUNT43, choice2arlist);
        outState.putIntegerArrayList(KEY_COUNT46, p1p2arlist);
        outState.putIntegerArrayList(KEY_COUNT47, p2p1arlist);

    }
}
