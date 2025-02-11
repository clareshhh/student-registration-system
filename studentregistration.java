
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class studentregistration {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String answer;
        String name = null;
        String address;
        String birthdate;
        String emailaddress;
        String contactnumber;
        String prevschool;
        String GPA;

        System.out.println("Type ANY KEY to open the program." + '\n' + "Type 'cancel program' if you wish to exit the program.");
        String enter2 = sc.nextLine();

        if (!enter2.equalsIgnoreCase("cancel program")) {
            do {
                System.out.println("\nWelcome to Xavier University - Ateneo de Cagayan!");
                System.out.println("Let us now proceed to your registration form.\nType 'OK' if you are interested!");
                String enter = sc.nextLine();

                if (enter.equalsIgnoreCase("OK")) {
                    System.out.println("\nFill in the registration form below.\n");
                    System.out.println("Name: ");
                    name = sc.nextLine();
                    System.out.println("\nAddress: ");
                    address = sc.nextLine();

                    while (true) {
                        try {
                            System.out.println("\nBirthdate (dd/mm/yyyy): ");
                            birthdate = sc.nextLine();
                            String[] parts = birthdate.split("/");
                            if (parts.length == 3) {
                                int day = Integer.parseInt(parts[0]);
                                int month = Integer.parseInt(parts[1]);
                                int year = Integer.parseInt(parts[2]);
                                break;
                            } else {
                                System.out.println(" ");
                                System.err.println("Invalid birthdate format. Try again.");
                            }
                        } catch (NumberFormatException e) {
                            System.out.println("Invalid birthdate format. Try again.");
                        }
                    }

                    System.out.println("\nEmail Address: ");
                    emailaddress = sc.nextLine();

                    while (true) {
                        try {
                            System.out.println("\nContact Number (11 digits): ");
                            contactnumber = sc.nextLine();
                            if (contactnumber.length() == 11 && contactnumber.matches("\\d+")) {
                                Long.parseLong(contactnumber);
                                break;
                            } else {
                                System.out.println(" ");
                                System.err.println("Invalid contact number format. It should be exactly 11 digits. Try again.");
                            }
                        } catch (NumberFormatException e) {
                            System.out.println("Invalid contact number format. Try again.");
                        }
                    }

                    System.out.println("\nPrevious School: ");
                    prevschool = sc.nextLine();
                    System.out.println("\nPrevious School GPA: ");
                    GPA = sc.nextLine();

                    System.out.println("\nName: " + name);
                    System.out.println("Address: " + address);
                    System.out.println("Birthdate: " + birthdate);
                    System.out.println("Email Address: " + emailaddress);
                    System.out.println("Contact Number: " + contactnumber);
                    System.out.println("Previous School: " + prevschool);
                    System.out.println("GPA: " + GPA);
                    System.out.println('\n');
                } else {
                    System.err.println("\n**If you are unable to access the form,\ntry again by typing 'RETRY'.\n(Make sure to type 'OK')**\n");
                }

                System.out.println("*If you wish to alter your details after filling the form,\nthen do alterations by typing 'RETRY'.\n(Otherwise, type ANY KEY if and only if\nyou are done filling the form.)*");

                answer = sc.nextLine();

            } while (answer.equalsIgnoreCase("RETRY"));
//COLLEGE SELECTION
            try (Scanner scan = new Scanner(System.in)) {
                do {
                    System.out.println("Please input the college code of your chosen department," + " " + name + "." + "\n" + "Please exclude the parenthesis. Ex. 9696" + "\n");

                    ArrayList<String> collegeCode = new ArrayList<String>();
                    collegeCode.add("College of Engineering (6578)");
                    collegeCode.add("\nCollege of Agriculture (8750)");
                    collegeCode.add("\nCollege of Computer Studies (9934)");
                    collegeCode.add("\nCollege of Arts and Social Sciences (2750)");
                    collegeCode.add("\nCollege of Nursing (8794)");
                    System.out.println(collegeCode);

                    ArrayList<Integer> codeList = new ArrayList<Integer>();

                    for (String code : collegeCode) {
                        String[] codes = code.split("[\\(\\)]");
                        codeList.add(Integer.parseInt(codes[1]));
                    }

                    int code = scan.nextInt();

                    while (!codeList.contains(code)) {
                    	System.out.println(" ");
                        System.err.println("The number you entered does not belong to any college department codes in Xavier University - Ateneo de Cagayan");
                        System.out.println("Please input the college code again of your chosen department.");
                        code = scan.nextInt();
                    }

                    String selectedCollege = ""; // Added variable to store the selected college
                    switch (code) {
                        case 6578:
                            selectedCollege = "College of Engineering";
                            System.out.println("You have chosen College of Engineering." + "\n");
                            break;
                        case 8750:
                            selectedCollege = "College of Agriculture";
                            System.out.println("You have chosen College of Agriculture." + "\n");
                            break;
                        case 9934:
                            selectedCollege = "College of Computer Studies";
                            System.out.println("You have chosen College of Computer Studies." + "\n");
                            break;
                        case 2750:
                            selectedCollege = "College of Arts and Social Sciences";
                            System.out.println("You have chosen College of Arts and Social Sciences." + "\n");
                            break;
                        case 8794:
                            selectedCollege = "College of Nursing";
                            System.out.println("You have chosen College of Nursing." + "\n");
                            break;
                        default:
                            System.out.println("The number you entered does not belong to any college code." + "\n");
                            break;
                    }

                    int score;
    	            do {
    	                System.out.println("Please input your entrance exam score below." + "\n");
    	                score = scan.nextInt();

    	                if (score > 100) {
    	                    System.err.println("The score you entered is beyond the range of the exam total. Try again." + "\n");
    	                }
    	            } while (score > 100);

    	            System.out.println(" ");

                    if ((code == 6578) && (score >= 90)) {
                        System.out.println("Welcome to the " + selectedCollege + "!" + "\n");
                    } else if ((code == 8750) && (score >= 80)) {
                        System.out.println("Welcome to the " + selectedCollege + "!" + "\n");
                    } else if ((code == 9934) && (score >= 85)) {
                        System.out.println("Welcome to the " + selectedCollege + "!" + "\n");
                    } else if ((code == 2750) && (score >= 80)) {
                        System.out.println("Welcome to the " + selectedCollege + "!" + "\n");
                    } else if ((code == 8794) && (score >= 95)) {
                        System.out.println("Welcome to the " + selectedCollege + "!" + "\n");
                    } else {
                        System.out.println("You do not meet the cut-off score of this College department" + "\n");
                        System.out.println("Do you want to select a different College department? Yes or No" + "\n");
                        answer = scan.next();
                        System.out.println(" ");
                        if (answer.equalsIgnoreCase("No")) {
                            // Conclusion for College selection if user selects "No"
                          System.out.println("Thank you for considering Xavier University - Ateneo de Cagayan. Goodbye!");
                            break;
                        } else {
                            continue;
                        }
                    }
                    


                    boolean selectSubjects = true;

                    while (selectSubjects) {
                        // Prompt to continue to subject selection
                        System.out.println("Press any key to continue to subject selection...");
                        scan.nextLine(); // Consume the newline character left in the input buffer
                        scan.nextLine(); // Wait for the user to press Enter

                        System.out.println("Please choose subjects for your college program:");
                        System.out.println("\n(Enter subject codes separated by commas ex. HIST1)");
                        System.out.println("\nReading in Philippine History(HIST1),\nMathematics in the Modern World(MATH4),\nUnderstanding the Self(PSY1),\nIntroduction to Christian Theology(THEO1),\nWritten Communication Skills Enhancement(ENGL1),"
                        		+ "\nOral Communication Skills Enhancement(ENGL2),\nIgnatian Culture and Mission(IDE10.1),\nScience, Technology, and Society(STS10),\nForeign Language 1(FL1),\nLife and Work of Rizal(HIST3)");
                        String subjectInput = sc.next();
                        String[] subjectCodes = subjectInput.split(",");

                        Map<String, String> subjects = new HashMap<>();
                        subjects.put("HIST1", "Reading in Philippine History");
                        subjects.put("MATH4", "Mathematics in the Modern World");
                        subjects.put("PSY1", "Understanding the Self");
                        subjects.put("THEO1", "Introduction to Christian Theology");
                        subjects.put("ENGL1", "Written Communication Skills Enhancement");
                        subjects.put("ENGL2", "Oral Communication Skills Enhancement");
                        subjects.put("IDE10.1", "Ignatian Culture and Mission");
                        subjects.put("STS10", "Science, Technology, and Society");
                        subjects.put("FL1", "Foreign Language 1");
                        subjects.put("HIST3", "Life and Work of Rizal");

                        System.out.println("\nSelected Subjects:");
                        for (String subjectCode : subjectCodes) {
                            String subjectMeaning = subjects.get(subjectCode);
                            if (subjectMeaning != null) {
                                System.out.println(subjectCode + " - " + subjectMeaning);
                            } else {
                                System.out.println(subjectCode + " - Subject not found");
                            }
                        }

                        System.out.println("Do you want to select different subjects? (Yes/No)");
                        answer = sc.next();

                        if (answer.equalsIgnoreCase("No")) {
                            selectSubjects = false;
                            System.out.println("Here are your selected subjects/subject.");
                            for (String subjectCode : subjectCodes) {
                                String subjectMeaning = subjects.get(subjectCode);
                                if (subjectMeaning != null) {
                                    System.out.println(subjectCode + " - " + subjectMeaning);
                                } else {
                                    System.out.println(subjectCode + " - Subject not found");
                                }
                            }
                           System.out.println("Welcome to Xavier University - Ateneo de Cagayan,"+" "+ name +"!");
                        }
                       
                    }
                } while (answer.equalsIgnoreCase("Yes"));
            } catch (NumberFormatException e) {
            
             
                    
    }
    }
}
}