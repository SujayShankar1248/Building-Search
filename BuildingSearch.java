

	//Sujay Shankar
	//Java

	import java.io.BufferedReader;
	import java.io.IOException;
	import java.io.InputStreamReader;
	import java.util.HashMap;
	//we will output the building, address, whether the location it is on north or central
	//Our input is the University of Michigan Building Acronym
	public class BuildingSearch {
		
	public static void main(String[]args) throws IOException {
		
		BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
		String classId=in.readLine().toUpperCase();
		
	    HashMap<String, String> abbKeys = new HashMap<String, String>()
	    		{{
	    			
	    			put("A&AB","Art & Architecture Building\n2000 BONISTEEL BLVD\nNorth Campus ");
	    			put("AH", "Angell Hall\n435 STATE ST\nCentral Campus");
	    			put("AL", "Walter E. Lay Automotive Lab\1231 Beal Ave\nNorth Campus");
	    			put("ALH", "Alice Lloyd Hall\n100 Observatory St\nThe Hill Area");
	    			put("ARGUS2","Argus Building II\n408 S. Fourth Street\nOff Campus");
	    			put("ARGUS3", "Argus Building III\n416 S. Fourth Street\nOff Campus");
	    			put("ARR", "Location to be Arranged");
	    			put("BAM HALL", "Blanch Anderson Moore Hall, School of Music\n100 BAITS DR\nNorth Campus");
	    			put("BELL POOL", "Margaret Bell Pool, Central Campus Recreation Building\n401 Washtenaw Ave\nThe Hill Area");
	    			put("BEYST", "Bob and Betty Beyster Building (formerly CSE)\n 2260 Hayward St\nNorth Campus");
	    			put("BIOL STAT", "Biological Station\n9133 Biological Rd\nOff Campus");
	    			put("BLAU", "Jeff T Blau Hall\n700 E University Ave\nCentral Campus");
	    			put("BMT", "Burton Memorial Tower\n230 North Ingalls Street\nCentral Campus");
	    			put("BOT GARD", "Matthaei Botanical Gardens\n1800 N. Dixboro Rd\nOff Campus");
	    			put("BSB", "Biolgical Sciences Building\n1105 N University Ave\nCentral Campus");
	    			put("BSRB", "Biomedical Science Research Building\n109 ZINA PITCHER PL\nMedical Campus");
	    			put("BURS", "Bursley Hall\n1931 DUFFIELD ST\nNorth Campus");
	    			put("BUS", "Business Administration\n701 TAPPAN ST\nCentral Campus");
	    			put("CAMP DAVIS", "Camp Davis\nJackson Hole, Wyoming");
	    			put("CCRB", "Central Campus Recreation Building\n401 WASHTENAW AVE\nCentral Campus");
	    			put("CHEM", "Chemistry Building\n930 N University Ave\nCentral Campus");
	    			put("CHRYS", "Chrysler Center\n2121 Bonisteel Blvd\nNorth Campus");
	    			put("COMM PARK", "Commerce Park\nDearborn, Michigan");
	    			put("COOL", "Cooley Building\n2355 BONISTEEL BLVD\nNorth Campus");
	    			put("COUZENS", "Couzens Hall\n1300 ANN ST\nThe Hill Area");
	    			put("CPH", "Children's Psychiatric Hospital\n1500 E Medical Center Dr\nMedical Campus");
	    			put("CRISLER", "Crisler Center\n333 Stadium Blvd\nSouth Campus");
	    			put("CCSB", "Campus Safety Services Building\n 401 E Stadium Blvd\nSouth Campus");
	    			put("DANA", "Dana Building\n 440 CHURCH ST\nCentral Campus");
	    			put("DANCE","Dance Building\n1310 UNIVERSITY CT\nThe Hill Area");
	    			put("DC", "Duderstadt Building\n2281 Bonisteel Blvd\nNorth Campus");
	    			put("DENT", "Dental Building\n1011 N University Ave\nCentral Campus");
	    			put("DOW", "DOW Engineering Building\n2300 Hayward St\nNorth Campus");
	    			put("E-BUS","Executive Education\n724 UNIVERSITY AVE\nCentral Campus");
	    			put("EECS", "Electrical Engineering and Computer Science Building\n1301 BEAL AVE\nNorth Campus");
	    			put("EH", "East Hall\n530 CHURCH ST\nCentral Campus");
	    			put("EQ", "East Quadrangle\n701 UNIVERSITY AVE\nCentral Campus");
	    			put("ERB1","Engineering Research Building 1\n2200 Bonisteel Blvd\nNorth Campus");
	    			put("ERB2", "Engineering Research Building 2\n2200 Bonisteel Blvd\nNorth Campus");
	    			put("EWRE", "Environmental & Water Resources Engineering Building\n1351 BEAL AVE\nNorth Campus");
	    			put("FA CAMP", "Fresh Air Camp\nPinckney, Michigan");
	    			put("FORD LIB", "Ford Library\n1000 Beal Ave\nNorth Campus");
	    			put("FXB", "Francois-Xavier Bagnoud Building\n1320 BEAL AVE\nNorth Campus");
	    			put("GFL", "Gorguze Family Laboratory(Formerly EPB\n2609 DRAPER DR\nNorth Campus");
	    			put("GGBL", "G. G. Brown Laboratory\n2350 HAYWARD ST\nNorth Campus");
	    			put("GLIBN", "Garlan Hatcher Graduate Library\n913 S University Ave\nCentral Campus");
	    			put("HH", "Haven Hall\n505 STATE ST\nCentral Campus");
	    			put("HUTCH", "Hutchins Hall\n625 STATE ST\nCentral Campus");
	    			put("IM POOL", "Intramural Building\n606 E Hoover Ave\nSouth Campus");
	    			put("IOE", "Industrial Operations Engineering BUilding\n1205 BEAL AVE\nNorth Campus");
	    			put("ISR", "Institute for Social Research\n426 THOMPSON ST\nCentral Campus");
	    			put("K-BUS", "Kresge Library\n700 East University Ave\nCentral Campus");
	    			put("KEC", "Kellogg Eye Center\n1000 WALL ST\nMedical Campus");
	    			put("KEENE THTR EQ", "Keene Theater, Residential College, East Quadrangle");
	    			put("KELSEY", "Kelsey Museum of Archaeology\n434 STATE ST\nCentral Campus");
	    			put("KHRI", "Kresge Hearing Research Institute\n1137 CATHERINE ST(4605 Medical Science Unit II)\nMedical Campus");
	    			put("LANE", "Lane Hall\n204 STATE ST\nCentral Campus");
	    			put("LBME", "Lurie Biomedical Engineering Building\n1101 Beal Ave\nNorth Campus");
	    			put("LEAG", "Michigan League\n911 UNIVERSITY AVE\nCentral Campus");
	    			put("LEC","Lurie Engineering Center\n1221 Beal Ave\nNorth Campus");
	    			put("LLIB","Law Library\n801 Monroe St\nCentral Campus");
	    			put("LORCH","Lorch Hall\n611 TAPPAN ST\nCentral Campus");
	    			put("LSA", "Literature, Science, and the Arts Building\n500 STATE ST\nCentral Campus");
	    			put("LSI", "Life Sciences Institute\n210 WASHTENAW AVE\nCentral Campus");
	    			put("LSHH", "Law School South Hall\n701 S State St\nCentral Campus");
	    			put("MARKLEY","Mary Markley Hall\n1503 WASHINGTON HTS\nThe Hill Area");
	    			put("MAX KADE", "Max Kade House\n627 Oxford Street\nOff Campus");
	    			put("MH", "Mason Hall\n419 STATE ST\nCentral Campus");
	    			put("MHRI","Mental Health Research Institute\n1150 Beal Ave.\nMedical Campus");
	    			put("MLB", "Modern Languages Building\n 812 WASHINGTON ST\nCentral Campus");
	    			put("MONREOCTY HD", "Monroe County Health Department\nMonroe, Michigan");
	    			put("MOSHER", "Mosher Jordan Hall\n200 OBSERVATORY ST\nThe Hill Area");
	    			put("MOTT", "C.S. Mott Children's Hospital\n1540 E Hospital Dr\nMedical Campus");
	    			put("MSC1","Medical Sciences Building 1\n150 MEDICAL CENTER DR\nMedical Campus");
	    			put("MSC2", "Medical Sciences Building 2\n1150 MEDICAL CENTER DR\nMedical Campus");
	    			put("MSRB","Medical Sciences Research Building III\n1150 MEDICAL CENTER DR\nMedical Campus");
	    			put("NAME", "Naval Architecture and Marine Engineering Building\n2600 DRAPER DR\nNorth Campus");
	    			put("NCRB", "North Campus Recreation Building\n2375 Hubbard Rd\nNorth Campus");
	    			put("NCRC", "North Campus Research Complex\n2800 Plymouth Rd\nNorth Campus");
	    			put("NIB", "300 North Ingalls Building\n300 N. Ingalls Street\nMedical Campus");
	    			put("400NI", "400 North Ingalls Building (old School of Nursing Building)\n426 North Ingalls Street\nMedical Campus");
	    			put("NORTHVILLEPH", "Northville State Hospital\n41001 W Seven Mile Rd\nNorthville,Michigan");
	    			put("NQ", "North Quad\n105 STATE ST\nCentral Campus");
	    			put("NS", "Edward Henry Kraus Natural Science Building\n830 N University Ave\nCentral Campus");
	    			put("NUB", "1100 North University Building (formerly CCL)\n1100 N University Ave\nCentral Campus");
	    			put("OBL", "Observatory Lodge\n1402 Washington Heights\nThe Hill Area");
	    			put("PALM", "Palmer Commons\n100 WASHTENAW AVE\nCentral Campus");
	    			put("PHEONIXLAB", "Pheonix Memorial Laboratory\n2301 Bonisteel Blvd\nNorth Campus");
	    			put("PIER", "Pierpoint Commons\n2101 BONISTEEL BLVD\nNorth Campus");
	    			put("POWER CTR", "Power Center for the Performing Arts\n121 Fletcher St\nCentral Campus" );
	    			put("RACK", "Horace H. Rackham, School of Graduate Studies\n915 WASHINGTON ST\nCentral Campus");
	    			put("RAND", "Randall Laboratory\n450 CHURCH ST\nCentral Campus");
	    			put("R-BUS", "Ross School of Business Building\n701 Tappan Ave\nCentral Campus");
	    			put("REVELLI", "William D. Revelli Hall\n350 HOOVER AVE\nSouth Campus");
	    			put("ROSS AC", "Stephen M. Ross Academic Center\n1110 S. State St.\nSouth Campus");
	    			put("RUTHVEN", "A. G. Ruthven Museums Building\n1109 GEDDES AVE\nCentral Campus");
	    			put("SCHEM", "Glenn E. Schembechler Hall\n1200 STATE ST\nSouth Campus");
	    			put("SEB", "School of Education Building\n610 UNIVERSITY AVE\nCentral Campus");
	    			put("SHAPIRO", "Shapiro Undergraduate Library\n919 UNIVERSITY AVE\nCentral Campus");
	    			put("SM", "Earl V. Moore Building, School of Music\n1100 BAITS DR\nNorth Campus");
	    			put("SNB", "School of Nursing Building\n426 N Ingalls St\nMedical Campus");
	    			put("SPH1", "Henry Vaughan Building, School of Public Health I\n1420 WASHINGTON HTS\nThe Hill Area");
	    			put("SPH2", "Thomas Francis, Jr Building, School of Public Health II\n1420 WASHINGTON HTS\nThe Hill Area");
	    			put("SRB", "Space Research Building\n2455 HAYWARD ST\nNorth Campus");
	    			put("SSWB", "School of Social Work Building\n1080 UNIVERSITY AVE\nCentral Campus");
	    			put("STAMPS", "Stamps Auditorium\n1226 MURFIN AVE\nNorth Campus");
	    			put("STB", "202 South Thayer Building\n202 THAYER ST\nCentral Campus");
	    			put("STJOSEPH HOSP", "St. Joseph Mercy Hospital\n5301 McAuley Dr\nOff Campus");
	    			put("STOCKWELL", "Stockwell Hall\n324 OBSERVATORY ST\nThe Hill Area");
	    			put("STRNS", "Sterns Building\n2005 BAITS DR\nNorth Campus");
	    			put("T&TB", "Track & Tennis Building\n2540 S. State St.\nOff Campus");
	    			put("TAP", "Tappen Hall\n855 South University Ave\nCentral Campus");
	    			put("TAUBL", "Learning Resource Center, Taubman Medical Library\n1135 E. Catherine St\nMedical Campus");
	    			put("TISH", "Tish Hall\n2260 HAYWARD ST\nCentral Campus");
	    			put("UM HOSP", "University Hospital\n1500 E Medical Center Dr\nMedical Campus");
	    			put("UMMA", "University of Michigan Museum of Art (Alumni Memorial Hall\n525 STATE ST\nCentral Campus");
	    			put("UNION", "Michigan Union\n530 STATE ST\nCentral Campus");
	    			put("USB", "Undergraduate Science Building\n204 WASHTENAW AVE\nCentral Campus");
	    			put("UTOWER", "University Towers\n1225 S. University\nCentral Campus");
	    			put("VETERANSHOSP", "Veterans Administration Hospital\n2215 Fuller Rd\nOff Campus");
	    			put("WASHCTY","Washtenaw County Health Department\n555 Towner St\nOff Campus");
	    			put("W-BUS", "Wylyl Hall\n770 E University Ave\nCetral Campus");
	    			put("WDC", "Charles R. Walgreen, Jr. Drama Center\n1226 MURFIN AVE\nNorth Campus");
	    			put("WEILL", "Joan and Sanford Weill Hal\n735 STATE ST\nCentral Campus");
	    			put("WEIS", "Weiser Hall\n500 CHURCH ST\nCentral Campus");
	    			put("WH", "West Hall\n1085 UNIVERSITY AVE\nCentral Campus");
	    			put("WOMEN'S HOSP", "Women's Hospital\n1540 E Hospital Dr\nMedical Campus");
	    			put("WQ", "West Quad\n541 THOMPSON ST\nCentral Campus");
	    			
	    			
	    		}};
	    		
	    System.out.println(abbKeys.get(classId));
	    in.close();

	}

}
