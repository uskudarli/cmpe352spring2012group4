# USE CASE ANALYSIS #

## Use Case Diagram: ##

![http://cmpe352spring2012group4.googlecode.com/files/UseCaseDiagram4.jpg](http://cmpe352spring2012group4.googlecode.com/files/UseCaseDiagram4.jpg)


---


## Use Cases: ##

[#UC1-Register](#UC1-Register.md)

[#UC2-Log\_in](#UC2-Log_in.md)

[#UC3-Create\_an\_interest](#UC3-Create_an_interest.md)

[#UC4-Subscribe\_to\_an\_interest](#UC4-Subscribe_to_an_interest.md)

[#UC5-Recommend\_person](#UC5-Recommend_person.md)

[#UC6-Recommend\_interest](#UC6-Recommend_interest.md)

[#UC7-Create\_an\_event](#UC7-Create_an_event.md)

[#UC8-Manage\_interest\_pages](#UC8-Manage_interest_pages.md)

[#UC9-Invite\_people\_to\_an\_event](#UC9-Invite_people_to_an_event.md)

[#UC10-Check\_e-mail\_validity](#UC10-Check_e-mail_validity.md)

[#UC11-Check\_membership\_availability](#UC11-Check_membership_availability.md)

[#UC12-Follow](#UC12-Follow.md)

[#UC13-Answer\_follower\_request](#UC13-Answer_follower_request.md)




---


### UC1-Register ###

**Name:** Register

**Actors:** All users and admins

**Goal:** To create a user space for every user and admin

**Preconditions:**

> •  To be a cmpe community member.

**Steps:**

> •	User will enter his basic personal information (name, surname, e-mail, password).

> •	System will add the information into the database and want the user to verify his e-mail.

> •	User will verify his e-mail and wait for the acceptance.

> •  Admin will check the membership availability.

**Postconditions:**

> •  System will create a profile page for the user.

### UC2-Log in ###

**Name:** Log in

**Actors:** All users and admins

**Goal:** To introduce the user to the system.

**Preconditions:**

> •  To be registered as a member of the website and to have an active account.

**Steps:**

> •	User will enter his e-mail and password, then click log in button.

> •	System will check the information.

**Postconditions:**

> •	System will direct the user to the home page.

### UC3-Create an interest ###

**Name:** Create an interest

**Actors:** All users and admins

**Goal:** To create a new interest for all users

**Preconditions:**

> •  To be a registered user or an admin who is logged in.

**Steps:**

> •  User will go to “Interests” page from the link on the home page.

> •  User will click the “Create an interest” button.

> •  User will choose the related category tags (pre-specified finite set of tags supplied by the administrator) such as music, sports, arts etc…

> •  User will be able to write down related search tags(user is free to enter any words).

> •  User will enter the information about the interest (and upload a profile Picture if he wants).

> •  The name of the interest will not be the same as an already-existing interest. The admin is responsible of making sure the interest names are proper (i.e. He may merge two similar interest pages).



### UC4-Subscribe to an interest ###

**Name:**  Subscribe to an interest

**Actors:** All Users

**Goal:** To allow all users to subscribe to an interest

**Preconditions:**

> •The registered user should log in the system.

> •The interest that the user want to subscribe should be already exist.

**Steps:**

> •User will search an interest via entering its name in the search bar.

> •Among the search results, he will choose an entry and go to that interest’s page.

> •User will click on subscribe button.

**Postconditions**:

> •The interest’s page will be added to his profile.




### UC5-Recommend person ###

**Name:** Recommend person

**Actors:** All users and admins

**Goal:** To recommend users to each other according to their interests.

**Preconditions:**

> • The registered user should log in the system.

> • The user should subscribe at least one interest.

**Steps:**

> •	System will determine the people who have similar interests with the user.


**Postconditions:**

> • These people will appear on the recommended people section.


### UC6-Recommend interest ###

**Name:** Recommend interest

**Actors:** All users and admins

**Goal:** To recommend interests to users according to their interests.

**Preconditions:**

> • The registered user should log in the system.

> • The user should subscribe at least one interest.


**Steps:**

> •	System will determine other interests which have the similar tags with the user’s interests.



**Postconditions:**

> • These interests will be appear on the recommended interests section.

### UC7-Create an event ###

**Name:** Create an Event

**Actors:** All Users and Admin

**Goal:** To allow all users and admin to create an event

**Preconditions:**

> •  The registered user or the admin should log in the system.

> •  The event that the user or the admin want to create should not be already exist

**Steps:**


> •	User will go to “Events” page from the link on the home page.

> •	User will click the “Create an event” button.

> •	User will enter the information about the event (name, place, time etc…)

> •	User will choose the related interests.

> •	User can invite people to the event by clicking on the “Invite” button.

**Postconditions**:

> •	System will create a notification about the event on other people’s (who has the same interest) home page

### UC8-Manage interest pages ###

**Name:** Manage Interests

**Actors:** Only admins

**Goal:** To allow a user to create a new interest requiring approval of admin

**Preconditions:**

> •	The interest that the user wants to create shouldn't be already exist.

> •	The interest that the user wants to create should be a valid activity.

**Steps:**

> •	User will enter his/her interest name.

> •	Admin will approve or reject the new request.

> •	System will add the new interest into the database if it is approved by the admin.


**Postconditions:**

> •	Interest name will be added to the database and it will be shown on the interest catagories after approval.



### UC9-Invite people to an event ###

**Name:** Invite people to an event

**Actors:** All users and admins

**Goal:** Invite other users to an event creating an invite notification

**Preconditions:**

> •The registered user or the admin should log in the system.

> •If it is a secret event user should be invited to invite other users


**Steps:**


> •  User will go to event page.

> •  User will click on the invite button

> •  User will choose other users who will be invited.

> •  User will click on the invite button after finishing choosing.


**Postconditions:**

> • System will create a notification about the event on the invited user's page.

### UC10-Check e-mail validity ###

**Name:** E-mail Validity

**Actors:** Admin and System Database

**Goal:** To allow a user to create a new account with a valid e-mail

**Preconditions:**

> •	The e-mail address that the user wants to use shouldn't be already exist.

> •	The e-mail address that the user wants to use should be a logical address(not a space or something written randomly) .


**Steps:**

> •	User will enter his/her email address.

> •	System will add the new email into the database if it is approved by the admin.


**Postconditions:**

> •	The e-mail address will be added to the database after approval.

### UC11-Check membership availability ###

**Name:** Check membership availability

**Actors:** All users

**Goal:** To check whether a user is a cmpe community member.

**Preconditions:**

> • A request from the user to register the web page.

**Steps:**

> • Admin will check the information of the user and decide whether he is a member of cmpe community.

> •  Admin will make the user's account active and send him a comfirmation e-mail.


**Postconditions:**

> • User will be defined to the web page and will be able to log in successfully.


### UC12-Follow ###

**Name:** Follow

**Actors:** All users

**Goal:** To be a follower of a user.

**Preconditions:**

> •The registered user or the admin should log in the system.

**Steps:**

> • User will go to page of the other user who he/she wants to follow.

> • User will click on the follow request button.

**Postconditions:**

> • A follow request notification will appear on the home page of the other user who is wanted to be followed.


### UC13-Answer follower request ###
**Name:** Answer follower request

**Actors:** All users

**Goal:** To accept or reject a user's follow request.

**Preconditions:**

> •The registered user or the admin should log in the system.

> •The registered user or the admin should have a follow notification.



**Steps:**

> • User will go to home page.

> • User will click on the follow request notification.

> • User will click either on the accept button or reject button.

**Postconditions:**

> • A notification will appear on the home page of the other user who wants to follow the user.


---


## Use Case Scenarios: ##

> _1. A new user whose main interest is making old style kites registers to the site. System recommends people and communities for this person whom he might enjoy._

  * Hakan is a Boğaziçi University Computer Engineering (CmpE) student. He has many diverse interests although he is an engineer. He wants to meet some other people from his department with whom he can share his interests. With this aim, he finds the social networking site “CmpE Community” and he discovers that there are many people registered to this site. After surfing a little bit in the site as a guest user and seeing there exist some of his interests in there, he decides to register.

  * Hakan then **registers** to the system by entering his name, surname, e-mail and a password.

  * By mistake, the e-mail he enters does not contain the symbol “@”.

  * System **checks e-mail validity** and asks Hakan to enter a valid e-mail address.

  * Hakan retries now with a valid e-mail address.

  * Admin **checks the membership availability** and accepts Hakan as a CMPE community member.

  * He wants to **create an interest** “making old style kites”. Hakan sees that his main interest isn’t present in the site. So he decides to add it by entering page by entering the name “making old style kites”, adds the category tags “arts”, “kite flying”, “old fashion” and adds the search tags as “old”, “kite”, “making kites”.

  * Hakan then **subscribes to the interest** "making old style kites" that he has created.

  * On his homepage, another interest “Gramophone” appears as an **interest recommendation** because it has the similar category tags “arts” and “old fashion” as well as the common “old” search tag.

  * On his homepage, another profile “Başak” appears as a **person recommendation** because she has some common interests with him including “making old style kites”.

  * Hakan decides to follow Başak because he thinks that it would be perfect to have been informed about someone who has similar interests with himself.He clicks on the follow request button and begins to waiting to be accepted.


> _2. A user wants to setup a BarCamp organization about Jquerry._

> Corresponding action sequence by use cases:

  * Ayşe is a Boğaziçi University Computer Engineering (CmpE) student. She wants to meet people who are interested in jquery and arrange a great BarCamp organization about it.Since she hears a lot of good stuff about our website,she decides to register.

  * Ayşe then registers to the system by entering her name, surname, e-mail and a password.

  * Admin **checks the membership availability** and accepts Ayşe as a CMPE community member.

  * Ayşe **creates an event** with the name "BarCamp Organization About jQuery" specifying the related interests tags as "programming" and "Web applications".

  * System confirms the creation of that event.

  * Ayşe **invites people** she already knew and registered to the system.

  * Users subscribed to "programming" and "Web applications" interests and users who are invited to the event will **get a notification about the event**.

[\*!!! NEW SCENARIOS !!!\*](http://cmpe352spring2012group4.googlecode.com/files/Storyboards%2018.10.2012.ppt)