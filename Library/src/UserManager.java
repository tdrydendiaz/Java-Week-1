import java.util.ArrayList;

public class UserManager implements CRUD {

		public ArrayList<Users> UsersList = new ArrayList<Users>();
		
		public void removeUser(Users u) {
			UsersList.remove(u);		
		}
		
		public void updateUser(Users u) {
			UsersList.add(u);
			
		}

		@Override
		public void create() {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void read() {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void update() {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void delete() {
			// TODO Auto-generated method stub
			
		}

//		@Override
//		public void delete(Users u) {
//			UsersList.remove(u);
			
			
		}

 


