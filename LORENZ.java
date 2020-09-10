import java.util.Scanner;
class LORENZ
{
    private static Scanner sc = new Scanner(System.in);
    private static StringBuffer Crypto;
    private static String Comment;
    private final static String PKey =  "twoqzucfdenmaxrphlbvsyigk";
    private final static String VKey = "thanos";
    public static void main(String args[])
    {
        MainMenu(); // Just that much? Yes, it manages from then on
    }
    private static void Out(String s)
    {
        System.out.print(s);
    }
    private static void Outln(String s)
    {
        System.out.println(s);
    }
    private static void Outln(StringBuffer s)
    {
            System.out.println(s);
    }
    private static void Outln()
    {
            System.out.println();
    }
    private static void Header()
    {
        Outln("\f");
        Outln("┌────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────┐");
        Outln("│                                                                                                                            │");
        Outln("│                                                                                                                            │");
        Outln("│ │\t\t\t\t\t┬   \t┌──┐\t┬──┐\t┌──┐\t┬╲  ┬\t┬──╱ \u00ae\t                                   │ │");
        Outln("│ │\t\t\t\t\t│   \t││││\t├┬─┘\t├─┤\t│ ╲ │\t  ╱\t                                   │ │");
        Outln("│ │\t\t\t\t\t└──┘\t└──┘\t┴└─\t└──┘\t┴  ╲┴\t ╱──┴\t                                   │ │");
        Outln("│                                       THE MOST WIDELY USED TEXT ENCRYPTOR - DECRYPTOR                                      │");
        Outln("│                                                                                                                            │");
        Outln("└────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────┘");            
    }
    private static void MainMenu()
    {
        int choice;
        Header();
        Outln("                                           ┌───────────────────────────────────────┐  ");
        Outln("                                          │                MAIN MENU                │ ");
        Outln("                                           └───────────────────────────────────────┘   "); 
        Outln("                                           ┌───────────────────────────────────────┐ ");
        Outln("                                           │  1       -       Encrypt Some Text    │ ");
        Outln("                                           │  2       -       Decrypt Some Text    │ ");
        Outln("                                           │  0       -       Exit                 │ ");
        Outln("                                           └───────────────────────────────────────┘ ");
        Out("Please Enter Your Choice: ");
        choice = sc.nextInt();
        sc.nextLine();
        switch(choice)
        {
            case 1: //Encrypt
            Encrypt(0); //Error free
            break;
            case 2: //Decrypt
            Decrypt(0); //Error free
            break;
            case 0: //Exit
            Exit();
            break;
            default:
            Outln("                                                      ┌──────────────────────┐");
            Outln("                                                      │  \u26a0INVALID INPUT │");
            Outln("                                                      └────────────────────────────┘");
            Outln("                                                    Press Enter To Continue...");
            sc.nextLine();
            MainMenu();
        }
    }
    private static void Encrypt(int x)  //ENCRYPT
    {
        int choice;
        Header();
        Outln("                                           ┌───────────────────────────────────────┐   ");
        Outln("                                          │             ENCRYPTION ZONE             │   ");
        Outln("                                           └───────────────────────────────────────┘    "); 
        Outln("┌───────────────────┐");
        Outln("│ Enter Plaintext:  │");
        Outln("└───────────────────┘");
        Out("\t");
        if(x == 0) //No error
            Crypto = new StringBuffer(sc.nextLine());
        else
            Outln(Crypto);
        Outln("                                           ┌───────────────────────────────────────┐ ");
        Outln("                                           │           Ciphers Available:          │ ");
        Outln("                                           ├───────────────────────────────────────┤ ");
        Outln("                                           │  1      -      Atbash Cipher          │ ");
        Outln("                                           │  2      -      Caesar Cipher          │ ");
        Outln("                                           │  3      -      ROT13 Cipher           │ ");
        Outln("                                           │  4      -      Affine Cipher          │ ");
        Outln("                                           │  5      -      Baconian Cipher        │ ");
        Outln("                                           │  6      -      Polybius Square Cipher │ ");        
        Outln("                                           │  7      -      Vigenere Cipher        │ ");
        Outln("                                           │  8      -      Beaufort Cipher        │ ");
        Outln("                                           └───────────────────────────────────────┘ ");
        Out("Please Enter Your Choice: ");
        choice = sc.nextInt();
        sc.nextLine();
        switch(choice)
        {
            case 1: //Atbash Cipher
            AtbashCipher(Crypto);
            Outln("┌─────────────┐");
            Outln("│ CIPHERTEXT: │ " + Crypto);
            Outln("└─────────────┘");
            AfterEncryption(1);
            break;
            case 2: //Caesar Cipher
            CaesarCipher(Crypto);
            Outln("┌─────────────┐");
            Outln("│ CIPHERTEXT: │ " + Crypto);
            Outln("└─────────────┘");
            AfterEncryption(2);
            break;
            case 3: //ROT13 Cipher
            ROT13Cipher(Crypto);
            Outln("┌─────────────┐");
            Outln("│ CIPHERTEXT: │ " + Crypto);
            Outln("└─────────────┘");
            AfterEncryption(3);
            break;
            case 4: //Affine Cipher
            AffineCipher(Crypto);
            Outln("┌─────────────┐");
            Outln("│ CIPHERTEXT: │ " + Crypto);
            Outln("└─────────────┘");
            AfterEncryption(4);
            break;
            case 5: //Baconian Cipher
            BaconianCipher(Crypto);
            Outln("┌─────────────┐");
            Outln("│ CIPHERTEXT: │ " + Crypto);
            Outln("└─────────────┘");
            AfterEncryption(5);
            break;
            case 6: //Polybius Square Cipher
            PolybiusSquareCipher(Crypto);
            Outln("┌─────────────┐");
            Outln("│ CIPHERTEXT: │ " + Crypto);
            Outln("└─────────────┘");
            AfterEncryption(6);
            break;
            case 7: //Vigenere Cipher
            VigenereCipher(Crypto);
            Outln("┌─────────────┐");
            Outln("│ CIPHERTEXT: │ " + Crypto);
            Outln("└─────────────┘");
            AfterEncryption(7);
            break;
            case 8: //Beaufort Cipher
            BeaufortCipher(Crypto);
            Outln("┌─────────────┐");
            Outln("│ CIPHERTEXT: │ " + Crypto);
            Outln("└─────────────┘");
            AfterEncryption(8);
            break;
            default:
            Outln("                                                      ┌──────────────────────┐");
            Outln("                                                      │  \u26a0INVALID INPUT │");
            Outln("                                                      └──────────────────────┘");
            Outln("                                                    Press Enter To Continue...");
            sc.nextLine();
            Encrypt(1);
        }
    }
    private static void AfterEncryption(int ch)
    {
        int choice;
        Outln();
        Outln("                                           ┌───────────────────────────────────────┐ ");
        Outln("                                           │            WHAT TO DO NOW?            │ ");
        Outln("                                           ├───────────────────────────────────────┤ ");
        Outln("                                           │  1      -      Show PLAINTEXT         │ ");
        Outln("                                           │  2      -      Return to MAIN MENU    │ ");
        Outln("                                           │  0      -      EXIT                   │ ");
        Outln("                                           └───────────────────────────────────────┘ ");
        Out("Please Enter Your Choice: ");
        choice = sc.nextInt();
        sc.nextLine();
        switch(choice)
        {
            case 1: //Decipher
            switch(ch)
            {
                case 1: // Atbash Decipher
                AtbashCipher(Crypto);  //Atbash Cipher and Decipher Algorithms are same
                Outln("┌─────────────┐");
                Outln("│ PLAINTEXT:  │ " + Crypto);
                Outln("└───────────────┘");
                Outln("\nPress Enter to Return To MAIN MENU...");
                sc.nextLine();
                MainMenu();
                break;
                case 2: // Caesar Decipher
                CaesarDecipher(Crypto);
                Outln("┌─────────────┐");
                Outln("│ PLAINTEXT:  │ " + Crypto);
                Outln("└─────────────┘");
                Outln("\nPress Enter to Return To MAIN MENU...");
                sc.nextLine();
                MainMenu();
                break;
                case 3: // ROT13 Decipher
                ROT13Decipher(Crypto);
                Outln("┌─────────────┐");
                Outln("│ PLAINTEXT:  │ " + Crypto);
                Outln("└─────────────┘");
                Outln("\nPress Enter to Return To MAIN MENU...");
                sc.nextLine();
                MainMenu();
                break;
                case 4: // Affine Decipher
                AffineDecipher(Crypto);
                Outln("┌─────────────┐");
                Outln("│ PLAINTEXT:  │ " + Crypto);
                Outln("└─────────────┘");
                Outln("\nPress Enter to Return To MAIN MENU...");
                sc.nextLine();
                MainMenu();
                break;
                case 5: // Baconian Decipher
                BaconianDecipher(Crypto);
                Outln("┌─────────────┐");
                Outln("│ PLAINTEXT:  │ " + Crypto);
                Outln("└─────────────┘");
                Outln("\nPress Enter to Return To MAIN MENU...");
                sc.nextLine();
                MainMenu();
                break;
                case 6: // Polybius Square Decipher
                PolybiusSquareDecipher(Crypto);
                Outln("┌─────────────┐");
                Outln("│ PLAINTEXT:  │ " + Crypto);
                Outln("└─────────────┘");
                Outln("\nPress Enter to Return To MAIN MENU...");
                sc.nextLine();
                MainMenu();
                break;
                case 7: // Vigenere Decipher
                VigenereDecipher(Crypto);
                Outln("┌─────────────┐");
                Outln("│ PLAINTEXT:  │ " + Crypto);
                Outln("└─────────────┘");
                Outln("\nPress Enter to Return To MAIN MENU...");
                sc.nextLine();
                MainMenu();
                break;
                case 8: // Beaufort Decipher
                BeaufortCipher(Crypto); // Beaufort Cipher and Decipher Algorithms are same
                Outln("┌─────────────┐");
                Outln("│ PLAINTEXT:  │ " + Crypto);
                Outln("└─────────────┘");
                Outln("\nPress Enter to Return To MAIN MENU...");
                sc.nextLine();
                MainMenu();
                break;
            }
            break;
            case 2: //Main Menu
            MainMenu();
            break;
            case 0: //Exit
            Exit();
            default:
            Outln("                                                      ┌──────────────────────┐");
            Outln("                                                      │  \u26a0INVALID INPUT │");
            Outln("                                                      └──────────────────────┘");
            Outln("                                                    Press Enter To Continue...");
            sc.nextLine();
            AfterEncryption(ch);
        }
    }
    private static void Decrypt(int x)  //DECRYPT
    {
        int choice;
        Header();
        Outln("                                           ┌───────────────────────────────────────┐   ");
        Outln("                                          │             DECRYPTION ZONE             │   ");
        Outln("                                           └───────────────────────────────────────┘    "); 
        Outln("┌───────────────────┐");
        Outln("│ Enter Ciphertext: │");
        Outln("└───────────────────┘");
        Out("\t");
        if(x==0)
            Crypto = new StringBuffer(sc.nextLine());
        else 
            Outln(Crypto);
        Outln("                                           ┌───────────────────────────────────────┐ ");
        Outln("                                           │          Deciphers Available:         │ ");
        Outln("                                           ├───────────────────────────────────────┤ ");
        Outln("                                           │  1     -     Atbash Decipher          │ ");
        Outln("                                           │  2     -     Caesar Decipher          │ ");
        Outln("                                           │  3     -     ROT13 Decipher           │ ");
        Outln("                                           │  4     -     Affine Decipher          │ ");
        Outln("                                           │  5     -     Baconian Decipher        │ ");
        Outln("                                           │  6     -     Polybius Square Decipher │ ");        
        Outln("                                           │  7     -     Vigenere Decipher        │ ");
        Outln("                                           │  8     -     Beaufort Decipher        │ ");
        Outln("                                           └───────────────────────────────────────┘ ");
        Out("Please Enter Your Choice: ");
        choice = sc.nextInt();
        sc.nextLine();
        switch(choice)
        {
            case 1: //Atbash Decipher
            AtbashCipher(Crypto);
            Outln("┌─────────────┐");
            Outln("│ PLAINTEXT:  │ " + Crypto);
            Outln("└─────────────┘");
            AfterDecryption(1);
            break;
            case 2: //Caesar Decipher
            CaesarDecipher(Crypto);
            Outln("┌─────────────┐");
            Outln("│ PLAINTEXT:  │ " + Crypto);
            Outln("└─────────────┘");
            AfterDecryption(2);
            break;
            case 3: //ROT13 Decipher
            ROT13Decipher(Crypto);
            Outln("┌─────────────┐");
            Outln("│ PLAINTEXT:  │ " + Crypto);
            Outln("└─────────────┘");
            AfterDecryption(3);
            break;
            case 4: //Affine Decipher
            AffineDecipher(Crypto);
            Outln("┌─────────────┐");
            Outln("│ PLAINTEXT:  │ " + Crypto);
            Outln("└─────────────┘");
            AfterDecryption(4);
            break;
            case 5: //Baconian Decipher
            BaconianDecipher(Crypto);
            Outln("┌─────────────┐");
            Outln("│ PLAINTEXT:  │ " + Crypto);
            Outln("└─────────────┘");
            AfterDecryption(5);
            break;
            case 6: //Polybius Square Decipher
            PolybiusSquareDecipher(Crypto);
            Outln("┌─────────────┐");
            Outln("│ PLAINTEXT:  │ " + Crypto);
            Outln("└─────────────┘");
            AfterDecryption(6);
            break;
            case 7: //Vigenere Decipher
            VigenereDecipher(Crypto);
            Outln("┌─────────────┐");
            Outln("│ PLAINTEXT:  │ " + Crypto);
            Outln("└─────────────┘");
            AfterDecryption(7);
            break;
            case 8: //Beaufort Decipher
            BeaufortCipher(Crypto);
            Outln("┌─────────────┐");
            Outln("│ PLAINTEXT:  │ " + Crypto);
            Outln("└─────────────┘");
            AfterDecryption(8);
            break;
            default:
            Outln("                                                      ┌──────────────────────┐");
            Outln("                                                      │  \u26a0INVALID INPUT │");
            Outln("                                                      └──────────────────────┘");
            Outln("                                                    Press Enter To Continue...");
            sc.nextLine();
            Decrypt(1);
        }
    }
    private static void AfterDecryption(int ch)
    {
        int choice;
        Outln();
        Outln("                                           ┌───────────────────────────────────────┐ ");
        Outln("                                           │            WHAT TO DO NOW?            │ ");
        Outln("                                           ├───────────────────────────────────────┤ ");
        Outln("                                           │  1      -      Show CIPHERTEXT        │ ");
        Outln("                                           │  2      -      Return to MAIN MENU    │ ");
        Outln("                                           │  0      -      EXIT                   │ ");
        Outln("                                           └───────────────────────────────────────┘ ");
        Out("Please Enter Your Choice: ");
        choice = sc.nextInt();
        sc.nextLine();
        switch(choice)
        {
            case 1: //Cipher
            switch(ch)
            {
                case 1: // Atbash Cipher
                AtbashCipher(Crypto);
                Outln("┌─────────────┐");
                Outln("│ CIPHERTEXT: │ " + Crypto);
                Outln("└─────────────┘");
                Outln("\nPress Enter to Return To MAIN MENU...");
                sc.nextLine();
                MainMenu();
                break;
                case 2: // Caesar Cipher
                CaesarCipher(Crypto);
                Outln("┌─────────────┐");
                Outln("│ CIPHERTEXT: │ " + Crypto);
                Outln("└─────────────┘");
                Outln("\nPress Enter to Return To MAIN MENU...");
                sc.nextLine();
                MainMenu();
                break;
                case 3: // ROT13 Cipher
                ROT13Cipher(Crypto);
                Outln("┌─────────────┐");
                Outln("│ CIPHERTEXT: │ " + Crypto);
                Outln("└─────────────┘");
                Outln("\nPress Enter to Return To MAIN MENU...");
                sc.nextLine();
                MainMenu();
                break;
                case 4: // Affine Cipher
                AffineCipher(Crypto);
                Outln("┌─────────────┐");
                Outln("│ CIPHERTEXT: │ " + Crypto);
                Outln("└─────────────┘");
                Outln("\nPress Enter to Return To MAIN MENU...");
                sc.nextLine();
                MainMenu();
                break;
                case 5: // Baconian Cipher
                BaconianCipher(Crypto);
                Outln("┌─────────────┐");
                Outln("│ CIPHERTEXT: │ " + Crypto);
                Outln("└─────────────┘");
                Outln("\nPress Enter to Return To MAIN MENU...");
                sc.nextLine();
                MainMenu();
                break;
                case 6: // Polybius Square Cipher
                PolybiusSquareCipher(Crypto);
                Outln("┌─────────────┐");
                Outln("│ CIPHERTEXT: │ " + Crypto);
                Outln("└─────────────┘");
                Outln("\nPress Enter to Return To MAIN MENU...");
                sc.nextLine();
                MainMenu();
                break;
                case 7: // Vigenere Cipher
                VigenereCipher(Crypto);
                Outln("┌─────────────┐");
                Outln("│ CIPHERTEXT: │ " + Crypto);
                Outln("└─────────────┘");
                Outln("\nPress Enter to Return To MAIN MENU...");
                sc.nextLine();
                MainMenu();
                break;
                case 8: // Beaufort Cipher
                BeaufortCipher(Crypto);
                Outln("┌─────────────┐");
                Outln("│ CIPHERTEXT: │ " + Crypto);
                Outln("└─────────────┘");
                Outln("\nPress Enter to Return To MAIN MENU...");
                sc.nextLine();
                MainMenu();
                break;
            }
            break;
            case 2: //Main Menu
            MainMenu();
            break;
            case 0: //Exit
            Exit();
            default:
            Outln("                                                      ┌──────────────────────┐");
            Outln("                                                      │  \u26a0INVALID INPUT │");
            Outln("                                                      └──────────────────────┘");
            Outln("                                                    Press Enter To Continue...");
            sc.nextLine();
            AfterDecryption(ch);
        }
    }
    private static void Exit()
    {
        char ch;
        Header();
        Outln("                                           ┌───────────────────────────────────────┐   ");
        Outln("                                          │                EXIT PAGE                │   ");
        Outln("                                           └───────────────────────────────────────┘    "); 
        Outln("                                                   Thank You for Using LORENZ\u00ae ");
        Outln("                                                     We Hope to See You Soon   ");
        Outln("                                                         Have a Nice Day !!");
        Outln("Do You Want To Leave A Feedback? \t (Y/N)");
        ch = sc.next().toUpperCase().charAt(0);
        sc.nextLine();
        switch(ch)
        {
            case 'Y':
            Outln("┌─────────────┐");
            Outln("│  FEEDBACK:  │");
            Outln("└─────────────┘");
            Out("\t");
            Comment = sc.nextLine();
            Outln("                                                 Thank You For The Feedback !!!");
            case 'N':  //Utilising fall-through
            System.exit(0);
            break;
            default:
            Outln("                                                      ┌──────────────────────┐");
            Outln("                                                      │  \u26a0INVALID INPUT │");
            Outln("                                                      └──────────────────────┘");
            Outln("                                                    Press Enter To Continue...");
            sc.nextLine();
            Exit();
        }
    }
    private static void CaesarCipher(StringBuffer S)
    {
        int i, x;
        char c;
        for(i=0; i<S.length(); i++)
        {
            c = S.charAt(i);
            x = (int)c;
            if(Character.isLetter(c))
            {
                if(Character.isUpperCase(c)) //Gets letter number
                    x = x - 64;
                else
                    x = x - 96;
                x = x + 3;  //Caesar Algorithm
                if(x > 26)  //For x, y and z
                {
                    x = x - 26; //Makes them a, b and c
                }
                if(Character.isUpperCase(c)) //Restores the case
                    x = x + 64;
                else
                    x = x + 96;
            }
            c = (char)x; //Gets Encrypted letter
            S.setCharAt(i, c);
        }
    }
    private static void ROT13Cipher(StringBuffer S)
    {
        int i, x;
        char c;
        for(i=0; i<S.length(); i++)
        {
            c = S.charAt(i); //Extract character
            x = (int)c; //get ASCII
            if(Character.isLetter(c))
            {
                if(Character.isUpperCase(c)) //Gets letter number
                    x = x - 64;
                else
                    x = x - 96;
                x = x + 13;  //ROT13 Algorithm
                if(x > 26)  //For x, y and z
                {
                    x = x - 26; //Makes them a, b and c
                }
                if(Character.isUpperCase(c)) //Restores the case
                    x = x + 64;
                else
                    x = x + 96;
            }
            c = (char)x; //Gets Encrypted letter
            S.setCharAt(i, c); //Set it
        }
    }
    private static void BaconianCipher(StringBuffer S)
    {
        int i, x, r;
        String C = "", Ciphered = "";
        char c;
        for(i=0; i<S.length(); i++)
        {
            c = S.charAt(i); //Extract character
            x = (int)c; //Gets ASCII
            if(Character.isLetter(c))
            {
                if(Character.isUpperCase(c)) //Gets letter number (starting from 0)
                    x = x - 65;
                else
                    x = x - 97;
                //Baconian Algorithm:
                do
                {
                    r = x % 2;
                    C = r + C;
                    x = x / 2;
                }while(x != 0);
                while(C.length() < 5) //Makes each cipher letter 5-character set
                    C = "0" + C;
                if(Character.isUpperCase(c)) //Adds the set according to the case
                    Ciphered = Ciphered + C.replace('0', 'A').replace('1', 'B');
                else
                    Ciphered = Ciphered + C.replace('0', 'a').replace('1', 'b');
                C = ""; // re-initialises
            }
            else
                Ciphered  = Ciphered + c; // if c is not a letter
        }
        Crypto = new StringBuffer(Ciphered);
    }
    private static void AffineCipher(StringBuffer S)
    {
        int a = 5, b = 15, m = 26, i, x;
        char c;
        for(i=0; i<S.length(); i++)
        {
            c = S.charAt(i);
            x = (int)c;
            if(Character.isLetter(c))
            {
                if(Character.isUpperCase(c))//Get the letter number from 0 onwards.
                    x = x - 65;
                else
                    x = x - 97;
                //Affine Cipher Algorithm:
                x = (a*x + b)%m;
                if(Character.isUpperCase(c)) //Restore the case
                    x = x + 65;
                else
                    x = x + 97;
            }
            c = (char)x; //Gets Encrypted letter
            S.setCharAt(i, c); //Set it
        }
    }
    private static void PolybiusSquareCipher(StringBuffer S)
    {
        int i, x, a, b;
        char c;
        String Ciphered = "";
        for(i=0; i<S.length(); i++)
        {
            c = S.charAt(i);
            if(Character.isLetter(c))
            {
                //Polybius Square Cipher Algorithm
                x = PKey.indexOf(Character.toLowerCase(c)) + 1;
                if(x > 0) // Since PKey has 25 letters, 1 letter is not present, for which PKey.indexOf()returns -1 
                {
                    a = (x%5 == 0) ? (x/5) : (x/5+1);
                    b = (x%5 == 0) ? 5 : (x%5);
                }
                else
                {
                    a = (int)'X' - 64;
                    b = (int)'Y' - 64;
                }
                if(Character.isUpperCase(c))
                    Ciphered = Ciphered + (char)(a + 64) + (char)(b + 64);
                else
                    Ciphered = Ciphered + (char)(a + 96) + (char)(b + 96);
            }
            else 
                Ciphered = Ciphered + c; 
        }
        Crypto = new StringBuffer(Ciphered);
    }
    private static void AtbashCipher(StringBuffer S)
    {
        int i, x;
        char c;
        for(i=0; i<S.length(); i++)
        {
            c = S.charAt(i);
            x = (int)c;
            if(Character.isLetter(c))
            {
                if(Character.isUpperCase(c))
                    x = x - 65;
                else
                    x = x - 97;
                //Atbash Algorithm:
                x = 25 - x;
                if(Character.isUpperCase(c))
                    x = x + 65;
                else
                    x = x + 97;
            }
            c = (char)x;
            S.setCharAt(i, c);
        }
    }
    private static void VigenereCipher(StringBuffer S)
    {
        int i,j = 0, x, y;
        char c;
        String key = "";
        //Let's make the unique key:
        for(i=0; ; i++)
        {
            if(S.length() == key.length())
                break;
            c = S.charAt(i);
            if(Character.isLetter(c))
            {
                key = key + VKey.charAt(j%VKey.length());
                j++;
            }
            else
                key = key + " ";
        }
        for(i=0; i<S.length(); i++)
        {
            c = S.charAt(i);
            x = (int)c;
            y = (int)key.charAt(i) - 97;
            if(Character.isLetter(c))
            {
                if(Character.isUpperCase(c))
                    x = x - 65;
                else 
                    x = x - 97;
                //Vigenere Algorithm
                x = (x + y) %26;
                if(Character.isUpperCase(c))
                    x = x + 65;
                else 
                    x = x + 97;
            }
            c = (char)x;
            S.setCharAt(i, c);
        }
    }
    private static void BeaufortCipher(StringBuffer S)
    {
        int i,j = 0, x, y;
        char c;
        String key = "";
        //Let's make the unique key:
        for(i=0; ; i++)
        {
            if(S.length() == key.length())
                break;
            c = S.charAt(i);
            if(Character.isLetter(c))
            {
                key = key + VKey.charAt(j%VKey.length());
                j++;
            }
            else 
                key = key + " ";
        }
        for(i=0; i<S.length(); i++)
        {
            c = S.charAt(i);
            x = (int)c;
            y = (int)key.charAt(i) - 97;
            if(Character.isLetter(c))
            {
                if(Character.isUpperCase(c))
                    x = x - 65;
                else 
                    x = x - 97;
                //Vigenere Algorithm
                x = (y - x + 26) % 26;
                if(Character.isUpperCase(c))
                    x = x + 65;
                else 
                    x = x + 97;
            }
            c = (char)x;
            S.setCharAt(i, c);
        }
    }
    private static void CaesarDecipher(StringBuffer S)
    {
        int i, x;
        char c;
        for(i=0; i<S.length(); i++)
        {
            c = S.charAt(i);
            x = (int)c;
            if(Character.isLetter(c))
            {
                if(Character.isUpperCase(c)) //Gets the letter number
                    x = x - 64;
                else
                    x = x - 96;
                //Caesar Decipher Algorithm:
                x = x - 3;
                if(x < 1)//For a, b and c
                    x = x + 26; //Makes the x, y and z
                if(Character.isUpperCase(c)) //Restores the case
                    x = x + 64;
                else
                    x = x + 96;
            }
            c = (char)x; //Gets Decrypted letter
            S.setCharAt(i, c);
        }
    }
    private static void ROT13Decipher(StringBuffer S)
    {
        int i, x;
        char c;
        for(i=0; i<S.length(); i++)
        {
            c = S.charAt(i);
            x = (int)c;
            if(Character.isLetter(c))
            {
                if(Character.isUpperCase(c)) //Gets the letter number
                    x = x - 64;
                else
                    x = x - 96;
                //ROT13 Decipher Algorithm:
                x = x - 13;
                if(x < 1)//For a, b and c
                    x = x + 26; //Makes the x, y and z
                if(Character.isUpperCase(c)) //Restores the case
                    x = x + 64;
                else
                    x = x + 96;
            }
            c = (char)x; //Gets Decrypted letter
            S.setCharAt(i, c);
        }
    }
    private static void BaconianDecipher(StringBuffer S)
    {
        int i, x, n, j, d;
        String C = "", Deciphered = "";
        char c;
        for(i=0; i<S.length(); i++)
        {
            c = S.charAt(i);
            if(Character.isLetter(c))
            {
                C = S.substring(i, i+5);
                j = 0;
                x = 0;
                if(Character.isUpperCase(c)) //Get Binary
                    C = C.replace('A', '0').replace('B', '1');
                else
                    C = C.replace('a', '0').replace('b', '1');
                n = Integer.valueOf(C); //Change to int
                do //BaconianDecipher Algortihm
                {
                    d = n % 10;
                    x += d * Math.pow(2, j);
                    j++;
                    n = n / 10;
                }while(n != 0);
                if(Character.isUpperCase(c))
                    x = x + 65;
                else
                    x = x + 97;
                Deciphered = Deciphered + (char)x;
                i = i + 4;
                continue;
            }
            else
                Deciphered = Deciphered + c;
        }
        Crypto = new StringBuffer(Deciphered);
    }
    private static void AffineDecipher(StringBuffer S)
    {
        int a = 5, b = 15, m = 26,x, i;
        char c;
        for(i = 0; i<S.length(); i++)
        {
            c = S.charAt(i);
            x = (int)c;
            if(Character.isLetter(c))
            {
                if(Character.isUpperCase(c))//Gets letter number starting from 0
                    x = x - 65;
                else
                    x = x - 97;
                //Affine Decipher Algorithm:
                x = (21*(x + 26 - 15)) % m; //21 is the multiplicative inverse for a(=5) in mod m(=26)
                if(Character.isUpperCase(c)) // Restore the case
                    x = x + 65;
                else
                    x = x + 97;    
            }
            c = (char)x; // Get the decypted letter
            S.setCharAt(i, c); //Set it
        }
    }
    private static void PolybiusSquareDecipher(StringBuffer S)
    {
        int i, x, a, b;
        char c, ch;
        String Deciphered = "";
        for(i=0; i<S.length(); i++)
        {
            c = S.charAt(i);
            if(Character.isLetter(c))
            {
                ch = S.charAt(i+1);
                if(Character.toLowerCase(c) != 'x')
                {
                    a = (int)(Character.toLowerCase(c)) - 96;
                    b = (int)(Character.toLowerCase(ch)) - 96;
                    x = (a-1)*5 + b - 1;
                    if(Character.isUpperCase(c))
                        Deciphered = Deciphered + Character.toUpperCase(PKey.charAt(x));
                    else 
                        Deciphered = Deciphered + PKey.charAt(x);
                }
                else  //j is missing from PKey
                {
                    if(Character.isUpperCase(c))
                        Deciphered = Deciphered + 'J';
                    else
                        Deciphered = Deciphered + 'j';
                }
                i++;
            }
            else
                Deciphered = Deciphered + c;
        }
        Crypto = new StringBuffer(Deciphered);
    }
    private static void VigenereDecipher(StringBuffer S)
    {
        int i,j = 0, x, y;
        char c;
        String key = "";
        //Let's make the unique key:
        for(i=0; ; i++)
        {
            if(S.length() == key.length())
                break;
            c = S.charAt(i);
            if(Character.isLetter(c))
            {
                key = key + VKey.charAt(j%VKey.length());
                j++;
            }
            else 
                key = key + " ";
        }
        for(i=0; i<S.length(); i++)
        {
            c = S.charAt(i);
            x = (int)c;
            y = (int)(key.charAt(i)) - 97;
            if(Character.isLetter(c))
            {
                if(Character.isUpperCase(c))
                    x = x - 65;
                else
                    x = x - 97;
                //DeVigenere Algorithm:
                x = (x - y + 26) % 26; //+26 handles (x-y)<0 and %26 handles (x-y+26)>26
                if(Character.isUpperCase(c))
                    x = x + 65;
                else
                    x = x + 97;
            }
            c = (char)x;
            S.setCharAt(i, c);
        }
    }
}