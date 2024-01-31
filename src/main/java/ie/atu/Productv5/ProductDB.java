package ie.atu.Productv5;


    public class ProductDB {

        public static Product getMyProduct(String productCode) {

            Product myProduct = null;
            Book myBook = null;
            TV myTV = null;
            Music myMusic = null;

            if (productCode.equalsIgnoreCase("java")) {
                myBook = new Book();
                myBook.setCode(productCode);
                myBook.setDescription("ATU Java Programming");
                myBook.setPrice(57.50);
                myBook.setAuthor("Joe Brown");
                myProduct = myBook;
            } else if (productCode.equalsIgnoreCase("jsp")) {
                myBook = new Book();
                myBook.setCode(productCode);
                myBook.setDescription("Java Servlets and JSP");
                myBook.setPrice(57.50);
                myBook.setAuthor("Mike White");
                myProduct = myBook;
            } else if (productCode.equalsIgnoreCase("mysql")) {
                myBook = new Book();
                myBook.setCode(productCode);
                myBook.setDescription("Lennon's MySQL");
                myBook.setPrice(54.50);
                myBook.setAuthor("Jim Lennon");
                myProduct = myBook;
            }
            else if (productCode.equalsIgnoreCase("pink")) {
                myMusic = new Music();
                myMusic.setCode("Pink");
                myMusic.setDescription("Wish you were here");
                myMusic.setLabel("Pink Floyd");
                myMusic.setPrice(8.00);
                myMusic.setArtist(" Part of the columbia group");
                myProduct = myMusic;
            }
            else if (productCode.equalsIgnoreCase("kdl43")) {
                myTV = new TV();
                myTV.setCode("Pink");
                myTV.setDescription("Sony bravia smart TV KDL43WF663 by SONY");
                myTV.setScreenSize(" Screen size is 55");
                myTV.setPrice(819.00);
                myTV.setManufacture("Part of the columbia group");
                myProduct = myTV;
            }

            return myProduct;
        }
    }
