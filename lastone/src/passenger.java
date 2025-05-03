public class passenger extends Member {




        private String password;


        passenger(String UserName, String ID,String password) {

          super(UserName,ID);
this.password = password;
        }
        public String getUserName() {
            return name;
        }

        public String getID() {
            return ID;
        }
        public String getPassword(){
            return password;
        }
    }





