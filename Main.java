package lab1;

import java.util.*;



class Main {

    static class patient {

        int patient_id;//the unique id of the patient assigned by the hospital

        float temperature;//the body temperature of the patient

        boolean seat_availability;//the available seats in the hospital

        String hospital_name;//the name of the hospital which is being registered

        ArrayList<String> hospital_tally = new ArrayList<>();//the arraylist to have all the hospitals

        ArrayList<Integer> hospital_p = new ArrayList<>();//the list to contain list of patients in the hospital

        int age;//age of the patient

        int oxygen_lvl;//the oxygen level of the body of the patient

        String name;//the name of the patient

        patient(int patient_id, String name,float temperature,int oxygen_lvl,int age ) {

            this.setpatient_id(patient_id);

            this.settemperature(temperature);

            this.name=name;

            this.oxygen_lvl=oxygen_lvl;

            this.age=age;

            this.sethospital_name("No Entry");

            this.setseat_availability(false);

            this.setage(age);

            this.setOxygen(oxygen_lvl);

            this.setname(name);

        }

        void setage(int age) {

            this.age=age;

        }

        void setOxygen(int oxygen_lvl) {

            this.oxygen_lvl=oxygen_lvl;

        }

        int getpatient_id() {

            return patient_id;

        }

        void setpatient_id(int patient_id) {

            this.patient_id = patient_id;

        }

        float gettemperature() {

            return temperature;

        }

        int getage()

        {

            return age;

        }

        int getoxygen_lvl()

        {

            return oxygen_lvl;

        }

        void settemperature(float temperature) {

            this.temperature = temperature;

        }

        String getname() {

            return name;

        }

        void setname(String name) {

            this.name = name;

        }

        boolean isseat_availability() {

            return seat_availability;

        }

        void setseat_availability(boolean seat_availability) {

            this.seat_availability = seat_availability;

        }

        String gethospital_name() {

            return hospital_name;

        }

        void sethospital_name(String hospital_name) {

            this.hospital_name = hospital_name;

        }

        ArrayList<String> gethospital_tally() {

            return hospital_tally;

        }

        void sethospital_tally(ArrayList<String> hospital_tally) {

            this.hospital_tally = hospital_tally;

        }

        ArrayList<Integer> gethospital_p() {

            return hospital_p;

        }

        void sethospital_p(ArrayList<Integer> hospital_p) {

            this.hospital_p = hospital_p;

        }}

    static class Hospital {

        String hospital_name;

        int temp_oxy;

        int seats;

        HashMap<Integer, Integer> hospital_patient = new HashMap<>();

        ArrayList<Integer> health_centres = new ArrayList<>();

        ArrayList<String> criteria = new ArrayList<>();

        String status;

        int patient_ent;

        Hospital()//constructor

        {

            hospital_name="";//the name of the respective hospital

            temp_oxy=0;//the temperature over oxygen precendece

            seats=0;//the seats available

            status="OPEN";// the seats available

            patient_ent=0;//the patients entered counter

        }

        Hospital(String hospital_name, int temp_oxy, int seats, ArrayList<String> criteria, HashMap<Integer, Integer> hospital_patient, ArrayList<Integer> health_centres, int patient_ent) {

            //parameterised constructor

            this.sethospital_name(hospital_name);

            this.hospital_name=hospital_name;

            this.settemp_oxy(temp_oxy);

            this.temp_oxy=temp_oxy;

            this.setseats(seats);

            this.seats=seats;

            this.sethospital_patient(hospital_patient);

            this.sethealth_centres(health_centres);

            this.setcriteria(criteria);

            this.setStatus("OPEN");

            this.setpatient_ent(patient_ent);

        }

        String gethospital_name() {

            return hospital_name;

        }

        void sethospital_name(String hospital_name) {

            this.hospital_name = hospital_name;

        }

        int gettemp_oxy() {

            return temp_oxy;

        }

        void settemp_oxy(int temp_oxy) {

            this.temp_oxy = temp_oxy;

        }

        int getseats() {

            return seats;

        }

        void setseats(int seats) {

            this.seats = seats;

        }

        HashMap<Integer, Integer> gethospital_patient() {

            return hospital_patient;

        }

        void sethospital_patient(HashMap<Integer, Integer> hospital_patient) {

            this.hospital_patient = hospital_patient;

        }

        ArrayList<Integer> gethealth_centres() {

            return health_centres;

        }

        void sethealth_centres(ArrayList<Integer> health_centres) {

            this.health_centres = health_centres;

        }

        ArrayList<String> getcriteria() {

            return criteria;

        }

        void setcriteria(ArrayList<String> criteria) {

            this.criteria = criteria;

        }

        String getStatus() {

            return status;

        }

        void setStatus(String status) {

            this.status = status;

        }



        void setpatient_ent(int patient_ent) {

            this.patient_ent = patient_ent;

        }}



    final ArrayList<Hospital> hospitals = new ArrayList<>();

    final ArrayList<patient> patients = new ArrayList<>();

    void AddHospital(String pat_n, int eligi_cr, int reg_i, ArrayList<String> regs, HashMap<Integer, Integer> patients_man, ArrayList<Integer> pat_cr, int cam_no) {

        Hospital hop = new Hospital(pat_n, eligi_cr, reg_i, regs, patients_man, pat_cr, cam_no);

        hospitals.add(hop); }

    void Addpatient(int r, String name, float temperature,int oxygen_lvl,int age ) {

        patient s = new patient(r, name, temperature, oxygen_lvl, age);

        patients.add(s); }

    void Disppatient(int r) {

        for (patient st : patients) {

            if (st.getpatient_id() == r) {

                System.out.println(st.getpatient_id());

                System.out.println(st.getage());

                System.out.println(st.getoxygen_lvl());

                System.out.println(st.gettemperature());

                System.out.println(st.getname());

                if (st.isseat_availability()) {

                    System.out.println("Seat_allotment status : " + "Alloted");

                } else {

                    System.out.println("Seat_allotment status : " + "Not Alloted");

                }

                System.out.println("Hospital name : " + st.gethospital_name()); } } }

    void Displayall() {

        for (patient st : patients) {

            int i = 1;

            if (i < patients.size() + 1) {

                do {





                    if (st.getpatient_id() == i) {

                        System.out.println(st.getpatient_id());

                        System.out.println(st.getage());

                        System.out.println(st.getoxygen_lvl());

                        System.out.println(st.gettemperature());

                        System.out.println(st.getname());

                    }

                    i++;

                } while (i < patients.size() + 1);

            }

        }

    }

    void DispHospital(String s) {

        for (Hospital cp : hospitals) {

            if (cp.gethospital_name().equals(s)) {

                System.out.println(cp.gethospital_name());

                System.out.println("reg of patient criteria");

                int k = 0;

                while (k < cp.gettemp_oxy()) {

                    System.out.println(cp.getcriteria().get(k));

                    k++;

                }

                System.out.println("Number of seats available for  patients = " + cp.getseats());

                System.out.println("Application Status = " + cp.getStatus()); } } }

    void Disphospital_name() {

        for (Hospital cp : hospitals) {

            if (cp.getStatus().compareTo("OPEN") == 0) {

                System.out.println(cp.gethospital_name()); } } }

    void removepatient() {

        Iterator<patient> it = patients.iterator();

        while(it.hasNext()) {

            patient st = it.next();

            if(st.isseat_availability()) {

                System.out.println(st.getpatient_id());

                it.remove(); } } }

    void removeHospital() {

        Iterator<Hospital> it = hospitals.iterator();

        while(it.hasNext()) {

            Hospital cp = it.next();

            if(cp.getStatus().compareTo("CLOSED") == 0) {

                System.out.println(cp.gethospital_name());

                it.remove(); } } }

    ArrayList<Integer> id_search(ArrayList<String> arr) {

        ArrayList<Integer> patient_unique_id = new ArrayList<>();

        for (patient st : patients) {

            for (String s : arr)

                if (st.getname().compareTo(s) == 0) {

                    patient_unique_id.add(st.getpatient_id()); } }

        return patient_unique_id; }void initial_details(HashMap<Integer, Integer> hospital_patient, String hospital_name) {

        int l = patients.size();

        int i=0;

        while (i<l) {

            patient st = patients.get(i);

            if(hospital_patient.containsKey(st.getpatient_id())) {

                ArrayList<Integer> hosp_pat = st.gethospital_p();

                ArrayList<String> hosp_tally = st.gethospital_tally();

                hosp_pat.add(hospital_patient.get(st.getpatient_id()));

                st.sethospital_p(hosp_pat);

                hosp_tally.add(hospital_name);

                st.sethospital_tally(hosp_tally);

                patients.set(i, st); }

            i++;

        }

    }

    void Hospital_eligib(int id) {

        //  int l = patients.size();

        for (patient st : patients) {

            if (st.getpatient_id() == id) {

                int ltp = st.gethospital_p().size();

                ArrayList<Integer> hosp_pat = st.gethospital_p();

                ArrayList<String> hosp_tally = st.gethospital_tally();

                int j = 0;

                while (j < ltp) {

                    System.out.println("name of hospital is  "+hosp_tally.get(j) + "     recovery time for the patient is  " + hosp_pat.get(j));

                    j++;

                }

            } } }static <T> ArrayList<T> removeDuplicates(ArrayList<T> list)

    { Set<T> set = new LinkedHashSet<>(list);

        list.clear();

        list.addAll(set);

        return list;

    }void Alloted(String hospital_name) {

        int sea_h = hospitals.size();

        int pat_h= patients.size();

        System.out.println("patient_id no. of alloted patient");

        if(this.getNum()>0) {

            int i=0;

            while (i<sea_h) {

                Hospital cp = hospitals.get(i);

                if(Objects.equals(cp.hospital_name, hospital_name)) {

                    if(cp.getseats() >= this.getNum()) {

                        cp.setStatus("CLOSED");

                        cp.setpatient_ent(this.getNum());

                        cp.setseats(0);

                        hospitals.set(i , cp);

                        this.setNum(0);

                        hospitals.set(i, cp);

                        int j=0;

                        while (j<pat_h) {

                            patient sc = patients.get(j);

                            sc.setseat_availability(true);

                            sc.sethospital_name(hospital_name);

                            System.out.println(sc.getpatient_id());

                            System.out.println("patient name   = "+sc.getname());

                            patients.set(j, sc);

                            j++;

                        }

                    }if(cp.getseats() < this.getNum()) {

                        ArrayList<Integer> v = cp.gethealth_centres();

                        HashMap<Integer, Integer> hospital_patient = cp.gethospital_patient();

                        ArrayList<Integer> vr = new ArrayList<>(hospital_patient.keySet());

                        Collections.sort(v);

                        ArrayList<Integer> shortlist;

                        int rm = cp.getseats();

                        int g=v.get(0);

                        int f =0,c=1;

                        {

                            int j=1;

                            while (j<v.size()) {

                                if(g != v.get(j) ) {

                                    f=1; }

                                if(g == v.get(j)) {

                                    c++; }g=v.get(j);

                                j++;

                            }

                        }

                        if(f==0) {

                            ArrayList<Float> patient_bt = new ArrayList<>();

                            HashMap<Integer,Float> rc = new HashMap<>();

                            shortlist = new ArrayList<>(vr);

                            for (Integer integer : shortlist) {

                                for (patient sc : patients) {

                                    if (sc.getpatient_id() == integer) {

                                        patient_bt.add(sc.gettemperature());

                                        rc.put(sc.getpatient_id(), sc.gettemperature());

                                    } } }

                            Collections.sort(patient_bt);

                            Collections.reverse(patient_bt);

                            int j=0;

                            while (j<rm) {

                                for (int patient_key : shortlist) {

                                    if (patient_bt.get(j) == (float) rc.get(patient_key)) {

                                        int l = 0;

                                        while (l < pat_h) {

                                            patient sc = patients.get(l);

                                            if (sc.getpatient_id() == patient_key) {

                                                System.out.println(sc.getpatient_id());

                                                sc.sethospital_name(hospital_name);

                                                sc.setseat_availability(true);

                                                patients.set(l, sc); }

                                            l++;

                                        }

                                    } }

                                j++;

                            }

                            cp.setStatus("CLOSED");

                            cp.setpatient_ent(rm);

                            cp.setseats(0);

                            hospitals.set(i, cp);

                            this.setNum(this.getNum()-rm);

                        }

                        if(f==1) {

                            ArrayList<Integer> temp = new ArrayList<>();

                            if(rm>=c) {

                                Collections.sort(v);

                                Collections.reverse(v);

                                {

                                    int j=0;

                                    while (j<rm) {

                                        int t=v.get(j);

                                        for (Integer integer : vr) {

                                            if ((float) t == (float) hospital_patient.get(integer)) {

                                                temp.add(integer); } }

                                        j++;

                                    }

                                }

                                shortlist = removeDuplicates(temp);

                                int j=0;

                                while (j<pat_h) {

                                    patient st = patients.get(j);

                                    for (Integer integer : shortlist) {

                                        if (st.getpatient_id() == integer) {

                                            st.sethospital_name(hospital_name);

                                            st.setseat_availability(true);

                                            System.out.println(st.getpatient_id());

                                            patients.set(j, st); } }

                                    j++;

                                }

                            }

                            else {

                                {

                                    int j=0;

                                    while (j<c) {

                                        int t=v.get(j);

                                        for (Integer integer : vr) {

                                            if (t == hospital_patient.get(integer)) {

                                                temp.add(integer); } }

                                        j++;

                                    }

                                }

                                shortlist = removeDuplicates(temp);

                                ArrayList<Float> patient_bt = new ArrayList<>();

                                HashMap<Integer,Float> rc = new HashMap<>();

                                for (Integer integer : shortlist) {

                                    for (patient st : patients) {

                                        if (st.getpatient_id() == integer) {

                                            patient_bt.add(st.gettemperature());

                                            rc.put(st.getpatient_id(), st.gettemperature()); } } }Collections.sort(patient_bt);

                                Collections.reverse(patient_bt);

                                int j=0;

                                while (j<rm) {

                                    for (int patient_key : shortlist) {

                                        if ((float) patient_bt.get(j) == rc.get(patient_key)) {

                                            System.out.println(patient_key);

                                            int l = 0;

                                            while (l < pat_h) {

                                                patient st = patients.get(l);

                                                if (st.getpatient_id() == patient_key) {

                                                    System.out.println(st.getpatient_id());

                                                    st.sethospital_name(hospital_name);

                                                    st.setseat_availability(true);

                                                    patients.set(l, st); }

                                                l++;

                                            }

                                        } }

                                    j++;

                                }

                            }

                            cp.setStatus("CLOSED");

                            cp.setpatient_ent(rm);

                            cp.setseats(0);

                            hospitals.set(i, cp);

                            this.setNum(this.getNum()-rm); } } }

                i++;

            }

        } }

    int num;

    int getNum() {

        return num;  }

    void setNum(int num) {

        this.num = num; }

    public static void main(String[] args) {

        // TODO Auto-generated method stub

        Main p = new Main();

        Scanner scan = new Scanner(System.in);

        System.out.println("The number of patients to be entered are");

        String n = scan.next();

        p.setNum(Integer.parseInt(n));

        {

            int i=0;

            while (i<p.getNum()) {

                String name = scan.next();

                float temp = Float.parseFloat(scan.next());

                int age=scan.nextInt();

                int oxygen_lvl=scan.nextInt();

                p.Addpatient(i+1, name,temp,oxygen_lvl, age);

                i++;

            }

        }

        System.out.println("The patients in the camp are registered");

        System.out.println("This is a menu driven program");

        System.out.println("The following are the options available for the users to use the software");

        System.out.println("1. Add healthcare institute" );

        System.out.println("2.Remove the account of the admitted patients");

        System.out.println("3.Remove the accounts of the filled healthcare centres");

        System.out.println("4.Display the patients still in the camp");

        System.out.println("5.Display centres still having vacant seats ");

        System.out.println("6.Display the details of the healthcare institute ");

        System.out.println("7.Display the details of the particular patients ");

        System.out.println("8.Display all the patients");

        System.out.println("9.Display names of the patients admitted and the recovery time");

        do { System.out.println("Enter your query:-");

            int query = Integer.parseInt(scan.next());

            switch(query) {

                case 1:{

                    System.out.println("Welcome to the hospital management software created by IIITD ");

                    System.out.println("Type the name of the centre");

                    System.out.println("The hospital to be added:");

                    String hospital_name = scan.next();

                    System.out.println("Eligibility Criteria");

                    int courn = Integer.parseInt(scan.next());

                    ArrayList<String> arr = new ArrayList<>();

                    {

                        int i = 0;

                        while (i < courn) {

                            System.out.println("the upper limit of the body temperature -");

                            System.out.println("the upper limit of the oxygen level-");

                            arr.add(scan.next());

                            i++;

                        }

                    }

                    System.out.println("Number of vacant seats");

                    int rn = scan.nextInt();

                    ArrayList<Integer> patient_unique_id = p.id_search(arr);

                    System.out.println(hospital_name);

                    System.out.println("Upper range criteria");

                    int i = 0;

                    if (i < courn) {

                        do {

                            System.out.println(arr.get(i));

                            i++;

                        } while (i < courn);

                    }

                    System.out.println("Number of Required patient = " + rn);

                    System.out.println("Application status = OPEN");

                    HashMap<Integer, Integer> hospital_patient = new HashMap<>();

                    ArrayList<Integer> health_centres = new ArrayList<>();

                    System.out.println("Enter the recovery days of the patients");

                    for (Iterator<Integer> iterator = patient_unique_id.iterator(); iterator.hasNext(); ) {

                        Integer integer = iterator.next();

                        System.out.println("Enter recovery date of  PId no. " + integer);

                        int m = scan.nextInt();

                        hospital_patient.put(integer, m);

                        health_centres.add(m);

                    }

                    p.AddHospital(hospital_name, courn, rn, arr, hospital_patient, health_centres, 0);

                    p.initial_details(hospital_patient, hospital_name);

                    break;}

                case 2: {

                    System.out.println("You are about to remove the account of the patient admitted successfully");

                    p.removepatient();

                    break;

                }



                case 3: {

                    System.out.println("3.You are about to remove the accounts of the filled healthcare centres");

                    p.removeHospital();

                    break;

                }



                case 4: {

                    System.out.println(p.getNum() + " patients still left for admission ");

                    break;

                }



                case 5: {

                    System.out.println("The hospitals still vacant are ");

                    p.Disphospital_name();

                    break;

                }

                case 6: {

                    System.out.println("Display the details of the hospitals");

                    String hospital_name = scan.next();

                    p.DispHospital(hospital_name);

                    break;



                }

                case 7: {

                    System.out.println("Displays a particular patient detials");

                    int id = Integer.parseInt(scan.next());

                    p.Disppatient(id);

                    break;





                }



                case 8: {

                    System.out.println("All the  patients are-");

                    p.Displayall();

                    break;

                }

                case 9: {

                    String hospital_name = scan.next();

                    p.Alloted(hospital_name);

                    int id = Integer.parseInt(scan.next());

                    p.Hospital_eligib(id);

                    break;



                }



                default:

                    System.out.println("Invalid");

            }

        }while(p.getNum() != 0);



    }



}
