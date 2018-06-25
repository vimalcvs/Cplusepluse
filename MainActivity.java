package com.vimalcvs.cplusplus;

import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AlertDialog;
import android.view.View;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener{
    ListView mListView;
    ArrayAdapter<String> adapter;
    String[] vimal = new String[]{
            "1 BASICS - OVERVIEW",
            "2 ENVIRONMENT SETUP",
            "3 BASIC SYNTAX",
            "4 COMMENTS",
            "5 DATA TYPES",
            "6 VARIABLE TYPES",
            "7 VARIABLE SCOPE",
            "8 CONSTANTS/LITERALS",
            "9 MODIFIER TYPES",


            "10 STORAGE CLASSES",
            "11 OPERATORS",
            "12 SIZE OF OPERATOR",
            "13 CONDITIONAL ? : OPERATOR",
            "14 COMMA OPERATOR",
            "15 MEMBER (DOT & ARROW) OPERATORS",
            "16 CASTING OPERATORS",
            "17 POINTER OPERATORS",
            "18 LOOP TYPES",
            "19 WHILE LOOP",



            "20 FOR LOOP",
            "21 DO...WHILE LOOP",
            "22 NESTED LOOPS",
            "23 BREAK STATEMENT",
            "24 CONTINUE STATEMENT",
            "25 GOTO STATEMENT",
            "26 DECISION MAKING",
            "27 IF STATEMENT",
            "28 IF...ELSE STATEMENT",
            "29 SWITCH STATEMENT",



            "30 SWITCH STATEMENT",
            "31 NESTED SWITCH STATEMENTS",
            "32 CONDITIONAL ? : OPERATOR",
            "33 FUNCTIONS",
            "34 FUNCTION CALL BY VALUE",
            "35 FUNCTION CALL BY POINTER",
            "36 FUNCTION CALL BY REFERENCE",
            "37 NUMBERS",
            "38 ARRAYS",
            "39 MULTI-DIMENSIONAL ARRAYS",


            "40 POINTER TO AN ARRAY",
            "41 PASSING ARRAYS TO FUNCTIONS",
            "42 RETURN ARRAY FROM FUNCTIONS",
            "43 STRINGS",
            "44 POINTERS",
            "45 NULL POINTERS",
            "46 POINTER ARITHMETIC",
            "47 POINTERS VS ARRAYS",
            "48 ARRAY OF POINTERS",
            "49 POINTER TO POINTER (MULTIPLE INDIRECTION)",


            "50 PASSING POINTERS TO FUNCTIONS",
            "51 RETURN POINTER FROM FUNCTIONS",
            "52 REFERENCES",
            "53 PASSING PARAMETERS BY REFERENCES",
            "54 RETURNING VALUES BY REFERENCE",
            "55 DATE & TIME",
            "56 BASIC INPUT/OUTPUT",
            "57 DATA STRUCTURES",
            "58 CLASSES & OBJECTS",
            "59 CLASS MEMBER FUNCTIONS",


            "60 CLASS ACCESS MODIFIERS",
            "61 CLASS CONSTRUCTOR AND DESTRUCTOR",
            "62 COPY CONSTRUCTOR",
            "63 FRIEND FUNCTIONS",
            "64 INLINE FUNCTIONS",
            "65 THIS POINTER",
            "66 POINTER TO CLASSES",
            "67 STATIC MEMBERS OF A CLASS",
            "68 INHERITANCE",
            "69 OVERLOADING OPERATORS & FUNCTIONS",


            "70 UNARY OPERATORS",
            "71 BINARY OPERATORS",
            "72 RELATIONAL OPERATORS",
            "73 INPUT/OUTPUT OPERATORS",
            "74 INCREMENT ++ AND DECREMENT --",
            "75 ASSIGNMENT OPERATORS",
            "76 FUNCTION CALL OPERATOR ()",
            "77 SUBSCRIPTING [ ] OPERATOR",
            "78 CLS MEMBER ACCESS OPERATOR (->)",
            "79 POLYMORPHISM",


            "80 ABSTRACTION",
            "81 ENCAPSULATION",
            "82 INTERFACES",
            "83 FILES AND STREAMS",
            "84 EXCEPTION HANDLING",
            "85 DYNAMIC MEMORY",
            "86 NAMESPACES",
            "87 TEMPLATES",
            "88 PREPROCESSOR",
            "89 SIGNAL HANDLING",

            "90 MULTITHREADING",
            "91 OBJECT ORIENTED",
            "92 STL TUTORIAL",
            "93 STANDARD LIBRARY",



    };


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        mListView = (ListView) findViewById(R.id.list_item);


        adapter = new ArrayAdapter<String>(this, R.layout.programlist, R.id.textView4, vimal);
        mListView.setAdapter(adapter);



        mListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                int itemPosition = position;
                String itemValue = (String) mListView.getItemAtPosition(position);
                if (position == 0) {

                    Intent i = new Intent(MainActivity.this, Webview.class);

                    i.putExtra("keyHTML", "file:///android_asset/1.html");
                    String message = "BASICS - OVERVIEW";
                    i.putExtra("key", message);
                    startActivity(i);

                }
                if (position == 1) {

                    Intent i = new Intent(MainActivity.this, Webview.class);
                    i.putExtra("keyHTML", "file:///android_asset/2.html");
                    String message = "ENVIRONMENT SETUP";
                    i.putExtra("key", message);
                    startActivity(i);
                }
                if (position == 2) {

                    Intent i = new Intent(MainActivity.this, Webview.class);
                    i.putExtra("keyHTML", "file:///android_asset/3.html");
                    String message = "BASIC SYNTAX";
                    i.putExtra("key", message);
                    startActivity(i);
                }
                if (position == 3) {

                    Intent i = new Intent(MainActivity.this, Webview.class);
                    i.putExtra("keyHTML", "file:///android_asset/4.html");
                    String message = "COMMENTS";
                    i.putExtra("key", message);
                    startActivity(i);


                }
                if (position == 4) {

                    Intent i = new Intent(MainActivity.this, Webview.class);
                    i.putExtra("keyHTML", "file:///android_asset/5.html");
                    String message = "DATA TYPES";
                    i.putExtra("key", message);
                    startActivity(i);
                }

                if (position == 5) {

                    Intent i = new Intent(MainActivity.this, Webview.class);
                    i.putExtra("keyHTML", "file:///android_asset/6.html");
                    String message = "VARIABLE TYPES";
                    i.putExtra("key", message);
                    startActivity(i);
                }


                if (position == 6) {

                    Intent i = new Intent(MainActivity.this, Webview.class);
                    i.putExtra("keyHTML", "file:///android_asset/7.html");
                    String message = "VARIABLE SCOPE";
                    i.putExtra("key", message);
                    startActivity(i);

                }
                if (position == 7) {

                    Intent i = new Intent(MainActivity.this, Webview.class);
                    i.putExtra("keyHTML", "file:///android_asset/8.html");
                    String message = "CONSTANTS/LITERALS";
                    i.putExtra("key", message);
                    startActivity(i);

                }
                if (position == 8) {

                    Intent i = new Intent(MainActivity.this, Webview.class);
                    i.putExtra("keyHTML", "file:///android_asset/9.html");
                    String message = "MODIFIER TYPES";
                    i.putExtra("key", message);
                    startActivity(i);

                }
                if (position == 9) {

                    Intent i = new Intent(MainActivity.this, Webview.class);
                    i.putExtra("keyHTML", "file:///android_asset/10.html");
                    String message = "STORAGE CLASSES";
                    i.putExtra("key", message);
                    startActivity(i);

                }
                if (position == 10) {

                    Intent i = new Intent(MainActivity.this, Webview.class);
                    i.putExtra("keyHTML", "file:///android_asset/11.html");
                    String message = "OPERATORS";
                    i.putExtra("key", message);
                    startActivity(i);
                }
                if (position == 11) {

                    Intent i = new Intent(MainActivity.this, Webview.class);
                    i.putExtra("keyHTML", "file:///android_asset/11-1.html");
                    String message = "SIZE OF OPERATOR";
                    i.putExtra("key", message);
                    startActivity(i);
                }
                if (position == 12) {

                    Intent i = new Intent(MainActivity.this, Webview.class);
                    i.putExtra("keyHTML", "file:///android_asset/11-2.html");
                    String message = "CONDITIONAL ? : OPERATOR";
                    i.putExtra("key", message);
                    startActivity(i);


                }
                if (position == 13) {

                    Intent i = new Intent(MainActivity.this, Webview.class);
                    i.putExtra("keyHTML", "file:///android_asset/11-3.html");
                    String message = "COMMA OPERATOR";
                    i.putExtra("key", message);
                    startActivity(i);
                }

                if (position == 14) {

                    Intent i = new Intent(MainActivity.this, Webview.class);
                    i.putExtra("keyHTML", "file:///android_asset/11-4.html");
                    String message = "MEMBER (DOT & ARROW) OPERATORS";
                    i.putExtra("key", message);
                    startActivity(i);
                }


                if (position == 15) {

                    Intent i = new Intent(MainActivity.this, Webview.class);
                    i.putExtra("keyHTML", "file:///android_asset/11-5.html");
                    String message = "CASTING OPERATORS";
                    i.putExtra("key", message);
                    startActivity(i);

                }
                if (position == 16) {

                    Intent i = new Intent(MainActivity.this, Webview.class);
                    i.putExtra("keyHTML", "file:///android_asset/11-6.html");
                    String message = "POINTER OPERATORS";
                    i.putExtra("key", message);
                    startActivity(i);

                }
                if (position == 17) {

                    Intent i = new Intent(MainActivity.this, Webview.class);
                    i.putExtra("keyHTML", "file:///android_asset/12.htm");
                    String message = "LOOP TYPES";
                    i.putExtra("key", message);
                    startActivity(i);

                }
                if (position == 18) {

                    Intent i = new Intent(MainActivity.this, Webview.class);
                    i.putExtra("keyHTML", "file:///android_asset/12-1.html");
                    String message = "WHILE LOOP";
                    i.putExtra("key", message);
                    startActivity(i);

                } if (position == 19) {

                    Intent i = new Intent(MainActivity.this, Webview.class);
                    i.putExtra("keyHTML", "file:///android_asset/12-2.html");
                    String message = "FOR LOOP";
                    i.putExtra("key", message);
                    startActivity(i);

                }


                if (position == 20) {

                    Intent i = new Intent(MainActivity.this, Webview.class);

                    i.putExtra("keyHTML", "file:///android_asset/12-3.html");
                    String message = "DO...WHILE LOOP";
                    i.putExtra("key", message);
                    startActivity(i);

                }
                if (position == 21) {

                    Intent i = new Intent(MainActivity.this, Webview.class);
                    i.putExtra("keyHTML", "file:///android_asset/12-4.html");
                    String message = "NESTED LOOPS";
                    i.putExtra("key", message);
                    startActivity(i);
                }
                if (position == 22) {

                    Intent i = new Intent(MainActivity.this, Webview.class);
                    i.putExtra("keyHTML", "file:///android_asset/12-5.html");
                    String message = "BREAK STATEMENT";
                    i.putExtra("key", message);
                    startActivity(i);
                }
                if (position == 23) {

                    Intent i = new Intent(MainActivity.this, Webview.class);
                    i.putExtra("keyHTML", "file:///android_asset/12-6.html");
                    String message = "CONTINUE STATEMENT";
                    i.putExtra("key", message);
                    startActivity(i);


                }
                if (position == 24) {

                    Intent i = new Intent(MainActivity.this, Webview.class);
                    i.putExtra("keyHTML", "file:///android_asset/12-7.html");
                    String message = "GOTO STATEMENT";
                    i.putExtra("key", message);
                    startActivity(i);
                }

                if (position == 25) {

                    Intent i = new Intent(MainActivity.this, Webview.class);
                    i.putExtra("keyHTML", "file:///android_asset/13.html");
                    String message = "DECISION MAKING";
                    i.putExtra("key", message);
                    startActivity(i);
                }









                if (position == 26) {

                    Intent i = new Intent(MainActivity.this, Webview.class);
                    i.putExtra("keyHTML", "file:///android_asset/13-1.html");
                    String message = "IF STATEMENT";
                    i.putExtra("key", message);
                    startActivity(i);

                }
                if (position == 27) {

                    Intent i = new Intent(MainActivity.this, Webview.class);
                    i.putExtra("keyHTML", "file:///android_asset/13-2.html");
                    String message = "IF...ELSE STATEMENT";
                    i.putExtra("key", message);
                    startActivity(i);

                }
                if (position == 28) {

                    Intent i = new Intent(MainActivity.this, Webview.class);
                    i.putExtra("keyHTML", "file:///android_asset/13-3.html");
                    String message = "SWITCH STATEMENT";
                    i.putExtra("key", message);
                    startActivity(i);

                }
                if (position == 29) {

                    Intent i = new Intent(MainActivity.this, Webview.class);
                    i.putExtra("keyHTML", "file:///android_asset/13-4.html");
                    String message = "SWITCH STATEMENT";
                    i.putExtra("key", message);
                    startActivity(i);





                }
                if (position == 30) {

                    Intent i = new Intent(MainActivity.this, Webview.class);
                    i.putExtra("keyHTML", "file:///android_asset/13-5.html");
                    String message = "NESTED SWITCH STATEMENTS";
                    i.putExtra("key", message);
                    startActivity(i);
                }
                if (position == 31) {

                    Intent i = new Intent(MainActivity.this, Webview.class);
                    i.putExtra("keyHTML", "file:///android_asset/13-6.html");
                    String message = "CONDITIONAL ? : OPERATOR";
                    i.putExtra("key", message);
                    startActivity(i);
                }
                if (position == 32) {

                    Intent i = new Intent(MainActivity.this, Webview.class);
                    i.putExtra("keyHTML", "file:///android_asset/14.html");
                    String message = "FUNCTIONS";
                    i.putExtra("key", message);
                    startActivity(i);


                }
                if (position == 33) {

                    Intent i = new Intent(MainActivity.this, Webview.class);
                    i.putExtra("keyHTML", "file:///android_asset/14-1.html");
                    String message = "FUNCTION CALL BY VALUE";
                    i.putExtra("key", message);
                    startActivity(i);
                }

                if (position == 34) {

                    Intent i = new Intent(MainActivity.this, Webview.class);
                    i.putExtra("keyHTML", "file:///android_asset/14-2.html");
                    String message = "FUNCTION CALL BY POINTER";
                    i.putExtra("key", message);
                    startActivity(i);
                }


                if (position == 35) {

                    Intent i = new Intent(MainActivity.this, Webview.class);
                    i.putExtra("keyHTML", "file:///android_asset/14-3.html");
                    String message = "FUNCTION CALL BY REFERENCE";
                    i.putExtra("key", message);
                    startActivity(i);

                }
                if (position == 36) {

                    Intent i = new Intent(MainActivity.this, Webview.class);
                    i.putExtra("keyHTML", "file:///android_asset/15.html");
                    String message = "NUMBERS";
                    i.putExtra("key", message);
                    startActivity(i);

                }
                if (position == 37) {

                    Intent i = new Intent(MainActivity.this, Webview.class);
                    i.putExtra("keyHTML", "file:///android_asset/16.html");
                    String message = "ARRAYS";
                    i.putExtra("key", message);
                    startActivity(i);

                }
                if (position == 38) {

                    Intent i = new Intent(MainActivity.this, Webview.class);
                    i.putExtra("keyHTML", "file:///android_asset/16-1.html");
                    String message = "MULTI-DIMENSIONAL ARRAYS";
                    i.putExtra("key", message);
                    startActivity(i);

                } if (position == 39) {

                    Intent i = new Intent(MainActivity.this, Webview.class);
                    i.putExtra("keyHTML", "file:///android_asset/16-2.html");
                    String message = "POINTER TO AN ARRAY";
                    i.putExtra("key", message);
                    startActivity(i);


                }


                if (position == 40) {

                    Intent i = new Intent(MainActivity.this, Webview.class);

                    i.putExtra("keyHTML", "file:///android_asset/16-3.html");
                    String message = "PASSING ARRAYS TO FUNCTIONS";
                    i.putExtra("key", message);
                    startActivity(i);

                }
                if (position == 41) {

                    Intent i = new Intent(MainActivity.this, Webview.class);
                    i.putExtra("keyHTML", "file:///android_asset/16-4.html");
                    String message = "RETURN ARRAY FROM FUNCTIONS";
                    i.putExtra("key", message);
                    startActivity(i);
                }
                if (position == 42) {

                    Intent i = new Intent(MainActivity.this, Webview.class);
                    i.putExtra("keyHTML", "file:///android_asset/17.html");
                    String message = "STRINGS";
                    i.putExtra("key", message);
                    startActivity(i);
                }
                if (position == 43) {

                    Intent i = new Intent(MainActivity.this, Webview.class);
                    i.putExtra("keyHTML", "file:///android_asset/18.html");
                    String message = "POINTERS";
                    i.putExtra("key", message);
                    startActivity(i);


                }
                if (position == 44) {

                    Intent i = new Intent(MainActivity.this, Webview.class);
                    i.putExtra("keyHTML", "file:///android_asset/18-1.html");
                    String message = "NULL POINTERS";
                    i.putExtra("key", message);
                    startActivity(i);
                }

                if (position == 45) {

                    Intent i = new Intent(MainActivity.this, Webview.class);
                    i.putExtra("keyHTML", "file:///android_asset/18-2.html");
                    String message = "POINTER ARITHMETIC";
                    i.putExtra("key", message);
                    startActivity(i);
                }


                if (position == 46) {

                    Intent i = new Intent(MainActivity.this, Webview.class);
                    i.putExtra("keyHTML", "file:///android_asset/18-3.html");
                    String message = "POINTERS VS ARRAYS";
                    i.putExtra("key", message);
                    startActivity(i);

                }
                if (position == 47) {

                    Intent i = new Intent(MainActivity.this, Webview.class);
                    i.putExtra("keyHTML", "file:///android_asset/18-4.html");
                    String message = "ARRAY OF POINTERS";
                    i.putExtra("key", message);
                    startActivity(i);

                }
                if (position == 48) {

                    Intent i = new Intent(MainActivity.this, Webview.class);
                    i.putExtra("keyHTML", "file:///android_asset/18-5.html");
                    String message = "POINTER TO POINTER (MULTIPLE INDIRECTION)";
                    i.putExtra("key", message);
                    startActivity(i);

                }
                if (position == 49) {

                    Intent i = new Intent(MainActivity.this, Webview.class);
                    i.putExtra("keyHTML", "file:///android_asset/18-6.html");
                    String message = "PASSING POINTERS TO FUNCTIONS";
                    i.putExtra("key", message);
                    startActivity(i);

                }
                if (position == 50) {

                    Intent i = new Intent(MainActivity.this, Webview.class);
                    i.putExtra("keyHTML", "file:///android_asset/18-7.html");
                    String message = "RETURN POINTER FROM FUNCTIONS";
                    i.putExtra("key", message);
                    startActivity(i);

                }
                if (position == 51) {

                    Intent i = new Intent(MainActivity.this, Webview.class);
                    i.putExtra("keyHTML", "file:///android_asset/19.html");
                    String message = "REFERENCES";
                    i.putExtra("key", message);
                    startActivity(i);


            }
                if (position == 52) {

                Intent i = new Intent(MainActivity.this, Webview.class);
                i.putExtra("keyHTML", "file:///android_asset/19-1.html");
                String message = "PASSING PARAMETERS BY REFERENCES";
                i.putExtra("key", message);
                startActivity(i);
            }

                if (position == 53) {

                Intent i = new Intent(MainActivity.this, Webview.class);
                i.putExtra("keyHTML", "file:///android_asset/19-2.html");
                String message = "RETURNING VALUES BY REFERENCE";
                i.putExtra("key", message);
                startActivity(i);
            }


                if (position == 54) {

                Intent i = new Intent(MainActivity.this, Webview.class);
                i.putExtra("keyHTML", "file:///android_asset/20.html");
                String message = "DATE & TIME";
                i.putExtra("key", message);
                startActivity(i);

            }
                if (position == 55) {

                Intent i = new Intent(MainActivity.this, Webview.class);
                i.putExtra("keyHTML", "file:///android_asset/21.html");
                String message = "BASIC INPUT/OUTPUT";
                i.putExtra("key", message);
                startActivity(i);

            }
                if (position == 56) {

                Intent i = new Intent(MainActivity.this, Webview.class);
                i.putExtra("keyHTML", "file:///android_asset/22.html");
                String message = " DATA STRUCTURES";
                i.putExtra("key", message);
                startActivity(i);

            }
                if (position == 57) {

                Intent i = new Intent(MainActivity.this, Webview.class);
                i.putExtra("keyHTML", "file:///android_asset/23.html");
                String message = "CLASSES & OBJECTS";
                i.putExtra("key", message);
                startActivity(i);

            } if (position == 58) {

                Intent i = new Intent(MainActivity.this, Webview.class);
                i.putExtra("keyHTML", "file:///android_asset/23-1.html");
                String message = "CLASS MEMBER FUNCTIONS";
                i.putExtra("key", message);
                startActivity(i);

            }


                if (position == 59) {

                Intent i = new Intent(MainActivity.this, Webview.class);

                i.putExtra("keyHTML", "file:///android_asset/23-2.html");
                String message = "CLASS ACCESS MODIFIERS";
                i.putExtra("key", message);
                startActivity(i);

            }
                if (position == 60) {

                Intent i = new Intent(MainActivity.this, Webview.class);
                i.putExtra("keyHTML", "file:///android_asset/23-3.html");
                String message = "CLASS CONSTRUCTOR AND DESTRUCTOR";
                i.putExtra("key", message);
                startActivity(i);
            }
                if (position == 61) {

                Intent i = new Intent(MainActivity.this, Webview.class);
                i.putExtra("keyHTML", "file:///android_asset/23-4.html");
                String message = "COPY CONSTRUCTOR";
                i.putExtra("key", message);
                startActivity(i);
            }
                if (position == 62) {

                Intent i = new Intent(MainActivity.this, Webview.class);
                i.putExtra("keyHTML", "file:///android_asset/23-5.html");
                String message = "FRIEND FUNCTIONS";
                i.putExtra("key", message);
                startActivity(i);


            }
                if (position == 63) {

                Intent i = new Intent(MainActivity.this, Webview.class);
                i.putExtra("keyHTML", "file:///android_asset/23-6.html");
                String message = "INLINE FUNCTIONS";
                i.putExtra("key", message);
                startActivity(i);
            }

                if (position == 64) {

                Intent i = new Intent(MainActivity.this, Webview.class);
                i.putExtra("keyHTML", "file:///android_asset/23-7.html");
                String message = "THIS POINTER";
                i.putExtra("key", message);
                startActivity(i);
            }









                if (position == 65) {

                Intent i = new Intent(MainActivity.this, Webview.class);
                i.putExtra("keyHTML", "file:///android_asset/23-8.html");
                String message = "POINTER TO CLASSES";
                i.putExtra("key", message);
                startActivity(i);

            }
                if (position == 66) {

                Intent i = new Intent(MainActivity.this, Webview.class);
                i.putExtra("keyHTML", "file:///android_asset/23-9.html");
                String message = "STATIC MEMBERS OF A CLASS";
                i.putExtra("key", message);
                startActivity(i);

            }
                if (position == 67) {

                Intent i = new Intent(MainActivity.this, Webview.class);
                i.putExtra("keyHTML", "file:///android_asset/24.html");
                String message = "INHERITANCE";
                i.putExtra("key", message);
                startActivity(i);

            }
                if (position == 68) {

                Intent i = new Intent(MainActivity.this, Webview.class);
                i.putExtra("keyHTML", "file:///android_asset/25.html");
                String message = "OVERLOADING OPERATORS & FUNCTIONS";
                i.putExtra("key", message);
                startActivity(i);





            }
                if (position == 69) {

                Intent i = new Intent(MainActivity.this, Webview.class);
                i.putExtra("keyHTML", "file:///android_asset/25-1.html");
                String message = "UNARY OPERATORS";
                i.putExtra("key", message);
                startActivity(i);
            }
                if (position == 70) {

                Intent i = new Intent(MainActivity.this, Webview.class);
                i.putExtra("keyHTML", "file:///android_asset/25-2.html");
                String message = "BINARY OPERATORS";
                i.putExtra("key", message);
                startActivity(i);
            }
                if (position == 71) {

                Intent i = new Intent(MainActivity.this, Webview.class);
                i.putExtra("keyHTML", "file:///android_asset/25-3.html");
                String message = "RELATIONAL OPERATORS";
                i.putExtra("key", message);
                startActivity(i);


            }
                if (position == 72) {

                Intent i = new Intent(MainActivity.this, Webview.class);
                i.putExtra("keyHTML", "file:///android_asset/25-4.html");
                String message = "INPUT/OUTPUT OPERATORS";
                i.putExtra("key", message);
                startActivity(i);
            }

                if (position == 73) {

                Intent i = new Intent(MainActivity.this, Webview.class);
                i.putExtra("keyHTML", "file:///android_asset/25-5.html");
                String message = "INCREMENT ++ AND DECREMENT --";
                i.putExtra("key", message);
                startActivity(i);
            }


                if (position == 74) {

                Intent i = new Intent(MainActivity.this, Webview.class);
                i.putExtra("keyHTML", "file:///android_asset/25-6.html");
                String message = "ASSIGNMENT OPERATORS";
                i.putExtra("key", message);
                startActivity(i);

            }
                if (position == 75) {

                Intent i = new Intent(MainActivity.this, Webview.class);
                i.putExtra("keyHTML", "file:///android_asset/25-7.html");
                String message = "FUNCTION CALL OPERATOR ()";
                i.putExtra("key", message);
                startActivity(i);

            }
                if (position == 76) {

                Intent i = new Intent(MainActivity.this, Webview.class);
                i.putExtra("keyHTML", "file:///android_asset/25-8.html");
                String message = "SUBSCRIPTING [ ] OPERATOR";
                i.putExtra("key", message);
                startActivity(i);

            }
                if (position == 77) {

                Intent i = new Intent(MainActivity.this, Webview.class);
                i.putExtra("keyHTML", "file:///android_asset/25-9.html");
                String message = "CLS MEMBER ACCESS OPERATOR (->)";
                i.putExtra("key", message);
                startActivity(i);

            } if (position == 78) {

                Intent i = new Intent(MainActivity.this, Webview.class);
                i.putExtra("keyHTML", "file:///android_asset/26.html");
                String message = "POLYMORPHISM";
                i.putExtra("key", message);
                startActivity(i);


            }


                if (position == 79) {

                Intent i = new Intent(MainActivity.this, Webview.class);

                i.putExtra("keyHTML", "file:///android_asset/27.html");
                String message = "ABSTRACTION";
                i.putExtra("key", message);
                startActivity(i);

            }
                if (position == 80) {

                Intent i = new Intent(MainActivity.this, Webview.class);
                i.putExtra("keyHTML", "file:///android_asset/28.html");
                String message = "ENCAPSULATION";
                i.putExtra("key", message);
                startActivity(i);
            }
                if (position == 81) {

                Intent i = new Intent(MainActivity.this, Webview.class);
                i.putExtra("keyHTML", "file:///android_asset/29.html");
                String message = "INTERFACES";
                i.putExtra("key", message);
                startActivity(i);
            }
                if (position == 82) {

                Intent i = new Intent(MainActivity.this, Webview.class);
                i.putExtra("keyHTML", "file:///android_asset/30.html");
                String message = "FILES AND STREAMS";
                i.putExtra("key", message);
                startActivity(i);


            }
                if (position == 83) {

                Intent i = new Intent(MainActivity.this, Webview.class);
                i.putExtra("keyHTML", "file:///android_asset/31.html");
                String message = "EXCEPTION HANDLING";
                i.putExtra("key", message);
                startActivity(i);
            }

                if (position == 84) {

                Intent i = new Intent(MainActivity.this, Webview.class);
                i.putExtra("keyHTML", "file:///android_asset/32.html");
                String message = "DYNAMIC MEMORY";
                i.putExtra("key", message);
                startActivity(i);
            }


                if (position == 85) {

                Intent i = new Intent(MainActivity.this, Webview.class);
                i.putExtra("keyHTML", "file:///android_asset/33.html");
                String message = "NAMESPACES";
                i.putExtra("key", message);
                startActivity(i);

            }
                if (position == 86) {

                Intent i = new Intent(MainActivity.this, Webview.class);
                i.putExtra("keyHTML", "file:///android_asset/34.html");
                String message = "TEMPLATES";
                i.putExtra("key", message);
                startActivity(i);

            }
                if (position == 87) {

                Intent i = new Intent(MainActivity.this, Webview.class);
                i.putExtra("keyHTML", "file:///android_asset/35.html");
                String message = "PREPROCESSOR";
                i.putExtra("key", message);
                startActivity(i);

            }
                if (position == 88) {

                Intent i = new Intent(MainActivity.this, Webview.class);
                i.putExtra("keyHTML", "file:///android_asset/36.html");
                String message = "SIGNAL HANDLING";
                i.putExtra("key", message);
                startActivity(i);

            }
                if (position == 89) {

                Intent i = new Intent(MainActivity.this, Webview.class);
                i.putExtra("keyHTML", "file:///android_asset/37.html");
                String message = "MULTITHREADING";
                i.putExtra("key", message);
                startActivity(i);

            }
                if (position == 90) {

                Intent i = new Intent(MainActivity.this, Webview.class);
                i.putExtra("keyHTML", "file:///android_asset/39.html");
                String message = "OBJECT ORIENTED";
                i.putExtra("key", message);
                startActivity(i);


            }
                if (position == 91) {

                Intent i = new Intent(MainActivity.this, Webview.class);
                i.putExtra("keyHTML", "file:///android_asset/40.html");
                String message = "STL TUTORIAL";
                i.putExtra("key", message);
                startActivity(i);

            }
                if (position == 92) {

                Intent i = new Intent(MainActivity.this, Webview.class);
                i.putExtra("keyHTML", "file:///android_asset/41.html");
                String message = "STANDARD LIBRARY";
                i.putExtra("key", message);
                startActivity(i);
            }


            }
        });



        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String share = "Learn Computer Course "+ "Download the app from the play store";
                String shareBody = share + "\nhttps://play.google.com/store/apps/details?id";
                Intent sharingIntent = new Intent(android.content.Intent.ACTION_SEND);
                sharingIntent.setType("text/plain");
                sharingIntent.putExtra(android.content.Intent.EXTRA_SUBJECT, "Learn Computer Course apps");
                sharingIntent.putExtra(android.content.Intent.EXTRA_TEXT, shareBody);
                startActivity(Intent.createChooser(sharingIntent, "Share via"));
            }
        });

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);
    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        int id = item.getItemId();
        if (id == R.id.action_about) {
            Intent intent = new Intent(MainActivity.this, Aboutme.class);
            startActivity(intent);
            return true;
        }
        if (id == R.id.action_share) {
            String share = " Learn Computer Course "+ "Download the app from the play store";
            String shareBody = share + "\nhttps://play.google.com/store/apps/details?id";
            Intent sharingIntent = new Intent(android.content.Intent.ACTION_SEND);
            sharingIntent.setType("text/plain");
            sharingIntent.putExtra(android.content.Intent.EXTRA_SUBJECT, "Learn Computer Course Apps");
            sharingIntent.putExtra(android.content.Intent.EXTRA_TEXT, shareBody);
            startActivity(Intent.createChooser(sharingIntent, "Share via"));
            return true;
        }
        if (id == R.id.action_exit) {
            AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);
            builder.setTitle(R.string.app_name);
            builder.setIcon(R.mipmap.ic_launcher);
            builder.setMessage("Do you want to exit?")
                    .setCancelable(false)
                    .setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                        public void onClick(DialogInterface dialog, int id) {
                            finish();
                        }
                    })
                    .setNegativeButton("No", new DialogInterface.OnClickListener() {
                        public void onClick(DialogInterface dialog, int id) {
                            dialog.cancel();
                        }
                    });
            AlertDialog alert = builder.create();
            alert.show();
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        int id = item.getItemId();

        if (id == R.id.nav_home) {
            Intent intent = new Intent(MainActivity.this, MainActivity.class);
            startActivity(intent);


        } else if (id == R.id.nav_sort) {
            Intent i = new Intent(MainActivity.this, Webview.class);
            i.putExtra("keyHTML", "file:///android_asset/52.htm");
            String message = "Windows 10 Shortcuts";
            i.putExtra("key", message);
            startActivity(i);

        } else if (id == R.id.nav_about) {
            Intent intent = new Intent(MainActivity.this, Aboutme.class);
            startActivity(intent);
        } else if (id == R.id.nav_rateus) {
            try {
                startActivity(new Intent(Intent.ACTION_VIEW,
                        Uri.parse("market://details?id=" + this.getPackageName())));
            } catch (android.content.ActivityNotFoundException e) {
                startActivity(new Intent(Intent.ACTION_VIEW,
                        Uri.parse("http://play.google.com/store/apps/details?id=" + this.getPackageName())));
            }


        } else if (id == R.id.nav_share) {
            String share = " Learn Computer Course " + "Download the app from the play store";
            String shareBody = share + "\nhttps://play.google.com/store/apps/details?id";
            Intent sharingIntent = new Intent(android.content.Intent.ACTION_SEND);
            sharingIntent.setType("text/plain");
            sharingIntent.putExtra(android.content.Intent.EXTRA_SUBJECT, "Learn Computer Course app");
            sharingIntent.putExtra(android.content.Intent.EXTRA_TEXT, shareBody);
            startActivity(Intent.createChooser(sharingIntent, "Share via"));
        } else if (id == R.id.nav_send) {
            Intent Email = new Intent(Intent.ACTION_SEND);
            Email.setType("text/email");
            Email.putExtra(Intent.EXTRA_EMAIL, new String[]{"vimalcvs29@gmail.com"});
            Email.putExtra(Intent.EXTRA_SUBJECT, "Feedback");
            Email.putExtra(Intent.EXTRA_TEXT, "Dear ...," + "");
            startActivity(Intent.createChooser(Email, "Send Feedback Email:"));
        } else if (id == R.id.nav_more) {
            try {
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("market://search?q=pub:Vimal CVS")));
            } catch (android.content.ActivityNotFoundException anfe) {
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://play.google.com/store/apps/dev?id=6064542819837033805")));
            }

        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;



    }
}
