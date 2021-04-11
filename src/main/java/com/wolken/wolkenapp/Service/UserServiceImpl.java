package com.wolken.wolkenapp.Service;

import org.jboss.logging.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wolken.wolkenapp.DAO.UserDAO;
import com.wolken.wolkenapp.DTO.UserDTO;
import com.wolken.wolkenapp.Entity.UserEntity;
import com.wolken.wolkenapp.Exception.PasswordException;
import com.wolken.wolkenapp.Exception.User2Exception;
import com.wolken.wolkenapp.Exception.UserException;
import com.wolken.wolkenapp.Exception.contactException;
import com.wolken.wolkenapp.Exception.usernameException;

@Service
public class UserServiceImpl implements UserService {
	@Autowired
	UserDAO userdao;
	Logger logger = Logger.getLogger("UserServiceImpl");

	@Override
	public String validateAndSave(UserDTO userdto) throws User2Exception  {
		try {
			if (userdto != null) {
				logger.info("inside validateAndSave");
				if (userdto.getUserName().length() < 18 && userdto.getUserName().length() > 3) {
					logger.info(userdto.getUserName());
					if (userdto.getContactno().length() < 11) {
						logger.info(userdto.getContactno());
						if (userdto.getPassword() != null) {
							logger.info(userdto.getPassword());

							UserEntity userentity;
							userentity = userdao.getByEmailId(userdto.getEmailId());
							if (userentity == null) {
								userentity = new UserEntity();
								logger.info("inside userentity validation");
								logger.info("setting userid in service");
								userentity.setUserName(userdto.getUserName());
								logger.info("setting username");
								userentity.setEmailId(userdto.getEmailId());
								logger.info("setting emailid");
								userentity.setUsn(userdto.getUsn());
								logger.info("setting usn");
								userentity.setBranch(userdto.getBranch());
								logger.info("setting branch");
								userentity.setDob(userdto.getDob());
								logger.info("setting dob");
								userentity.setGender(userdto.getGender());
								logger.info("setting gender");
								userentity.setContactno(userdto.getContactno());
								logger.info("setting contact no");
								userentity.setPassword(userdto.getPassword());
								logger.info("setting password");

								userentity.setCnfPassword(userdto.getCnfPassword());
								System.out.println(userentity);

								return userdao.save(userentity);
							} else {
								return "already present";
							}
						} else {
							//return "invalid password";
							throw new PasswordException();
						}

					} else {
						//return "invalid contact";
						throw new contactException();
					}
				} else {
					 throw new usernameException();
					//return "invalid userName";
				}

			} else {
				throw new UserException();
			}

		} catch (UserException | usernameException | contactException | PasswordException e) {
			logger.info("Exception in validate and save");
			e.printStackTrace();
			// TODO: handle exception
		}
		return "failed";

	}

}
