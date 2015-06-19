# REQUIREMENTS ANALYSIS #

## 1. General description ##

> The application shall be a social web application to create an environment, where CMPE community can express and discover matters of interest – academic or otherwise through an intelligent recommendation engine.

> This place shall evolve into an archive of useful information.

## 2. Specific requirements ##

### 2.1. FUNCTIONAL REQUIREMENTS ###

**2.1.1. User profiles**

> 2.1.1.1. Each user shall have their information fields such as: Name, Title(student, instructor, graduate…), Picture (optional), Birthday (optional), E-mail, Telephone(optional), Gender(optional), Interests, Connections, Education, Work(optional), Graduation Year etc.

> 2.1.1.2. Each user shall have an activity feed where her posts in Interests, her Voice updates, her participations to public Events and her contributions to Discussions and Surveys are displayed in a chronological order.

> 2.1.1.3. Voice: Voice is a personal message that a user can post on her activity feed and which are visible either to her friends or entire community. Each user shall post Voices in her user profile. The motto for posting a Voice is “Raise Your Voice!”.

> 2.1.1.3.1 Voices should be commentable by connections.

> 2.1.1.4. Each user shall have a social feed where contributions fetched from her social network accounts (i.e. Twitter, Foursquare, Instagram). These contributions should be visible to community friends and to everyone in the community if they are public.

> 2.1.1.5. Each user shall be able to connect the system with her Facebook account in order to provide information about herself through her 'like's. Her publications on Facebook will not be shared on the system. It shall only be used with the aim of better recommending Interests.

**2.1.2. Home page**

> 2.1.2.1. The user shall be directed to the home page after logging in.

> 2.1.2.2. Latest Discussions’ titles associated with user’s Interests, current Events associated with user’s Interests, latest Voices of friends, Occasions of the day, posts in user’s Interests and latest Survey questions associated with user’s Interests should appear on her home page.

> 2.1.2.3. There should be tiles for inbox, connections, notifications, Events, Discussions, Surveys, Interests and Occasions. These tiles should direct the user to pages with further relevant detail (e.g. Interests should take the user to the page where her Interests are listed).

**2.1.3. Interests**

> 2.1.3.1. Each user shall be able to create a special Interest page by specifying its name, choosing its category and defining related tags.

> 2.1.3.1.1. A tag is a user-defined string associated with the Interest. But if a tag already exists with the same name, then the user shall choose that pre-existing tag.

> 2.1.3.1.2. There shall be predefined categories from which user shall choose just one for each Interest that she created. (e.g. Sports, Arts, Academic, Science, Other...)

> 2.1.3.2. All Interest pages’ contents are visible to registered users.

> 2.1.3.3. Users shall be able to subscribe to any Interest.

> 2.1.3.4. The subscribers of the Interest shall be able to post to Interest’s page.

> 2.1.3.5. Each post in Interest page should be commentable by Interest subscribers.

> 2.1.3.6. Each Interest page should contain links to all Surveys, Events and Discussions associated with this Interest.

> 2.1.3.7 Besides the user contributions (posts), each Interest page should contain latest Surveys, Events and Discussions associated with this Interest.

**2.1.4. Discussions**

> 2.1.4.1. A user should be able to start a new discussion topic by entering a question.

> 2.1.4.1.1. The discussion owner shall choose the related Interests to specify the target audience.

> 2.1.4.2. All users should be able to reply.

**2.1.5. Surveys**

> 2.1.5.1. A user should be able to create a survey by entering a question and corresponding answers.

> 2.1.5.1.1. Answers shall have two types: radiobuttons (one answer), checkboxes(multiple answers).

> 2.1.5.1.2. Answers are limited to 25 maximum.

> 2.1.5.1.3. The user shall choose the related interests to specify the target audience.

> 2.1.5.1.4. The user shall specify the duration of the survey.

> 2.1.5.2. The owner of the survey should specify whether the results of the survey are visible.

> 2.1.5.3. All users should be able to answer but only once.

**2.1.6. Events**

> 2.1.6.1. A user should be able to create an Event.

> 2.1.6.1.1. The creator of the Event shall decide the basic information about the event such as date, time interval and place.

> 2.1.6.1.2. The creator shall choose the related Interests to specify the target audience.

> 2.1.6.4. A user may declare that she will attend the Event, thus she becomes an attendee of that Event.

> 2.1.6.5. The attendees of an event should be able to post content.

**2.1.7. Occasions**

> 2.1.7.1. A user should be able to create an Occasion.

> 2.1.7.1.1. As a user creates an Occasion, she can set the publish date as either today or tomorrow.

> 2.1.7.2. An Occasion is a daily event that lasts 1 day.

> 2.1.7.3. The aim of Occasions is to gather some community users on a daily basis. (e.g. Meeting for lunch, accompanying each other for the way to/from school etc...)

> 2.1.7.4. An Occasion becomes inactive at midnight. By becoming inactive it’s meant that it won’t be visible on the home page.

> 2.1.7.5. In Occasions page, all users can see the previous Occasions and current Occasions.

**2.1.8. Messaging**

> 2.1.8.1. Users should be able to send messages to each other.

> 2.1.8.2. Users should be able to see the number of unread messages on her homepage.

**2.1.9. Search/Advanced search**

> 2.1.9.1. A user shall search for a person, Survey, Interest, Discussion, Event and Occasion by title.

> 2.1.9.2. A user shall filter the result of search by using advanced search.

> 2.1.9.2.1 For a person, a user should be able to search for a name, title, birthday, e-mail, telephone, gender, Interests, education, work, graduation year.

> 2.1.9.2.2 For Survey, a user should be able to search a Survey associated with a specific Interest or contains any given word.

> 2.1.9.2.3 For Interest, a user should be able to search for an Interest with a given category and tagged with a given word.

> 2.1.9.2.4 For Discussion, a user should be able to search for a Discussion associated with a specific Interest or a Discussion whose title contains the given word.

> 2.1.9.2.5 For Event, a user should be able to search for an Event that’s happening at a certain date, Event that’s associated with a specific Interest of Event whose title contains the given word.

> 2.1.9.2.6 For Occasion, a user should be able to search for the title and content of an Occasion with the given word.

**2.1.10. Notifications**

> 2.1.10.1. There will be a page for each user where she will be able to check her notification list.

> 2.1.10.2. The user shall be able to determine which notifications to avoid via settings page.

> 2.1.10.3. A user shall get the notifications for the posts on her subscribed Interests.

> 2.1.10.4. A user shall get the notifications for the replies about the Discussion she created.

> 2.1.10.5. A user shall get the notifications for the result of the Surveys she created.

> 2.1.10.6. A user shall get the notifications for the connection requests.

> 2.1.10.7. A user shall get the notifications for the for the comments to her posts on Interest pages, on Event pages and her Voices.

> 2.1.10.8. A user shall get the notifications for the Event invitations.

> 2.1.10.9. A user shall get the reporting notifications if she is an administrator.

> 2.1.10.10. A subscriber of an Interest shall get the notifications for the creation of an Event, a Discussion and a Survey associated with that Interest.

**2.1.11. Reporting**

> 2.1.11.1. A user shall be able to report an Interest, a post to an Interest, a Voice, a Discussion, a reply to a discussion, a Comment, an Event, a post to an Event, a Survey, a Profile.

> 2.1.11.2. An administrator shall remove the reported content if she agrees that it is an abuse.

> 2.1.11.3. An administrator shall contact the report owner if she does not agree or does not understand why it is an abuse.

**2.1.12. Settings**

> 2.1.12.1. There shall be account and privacy settings sections.

**2.1.13. Help**

> 2.1.13.1. There should be a documentation about how to use the application.

**2.1.14. Registration process**

> 2.1.14.1 The guest user shall register the system with username, password, and email address.

> 2.1.14.2 The length of the username shall be 20 characters at maximum.

> 2.1.14.3. The username should be unique in the system.

> 2.1.14.4 The length of the password shall be between 6-12 characters.

> 2.1.14.5. The system will ask the user several questions to get better knowledge of her interests.

**2.1.15. Recommendation**

> 2.1.15.1. The system should recommend the user other people with similar Interests to create connections. (using Interest match)

> 2.1.15.2. The system should recommend the user Interests that she might be interested in. (using tag match)

> 2.1.15. The system should recommend the user to create a new Interest that she might be interested in. (using Facebook 'like's)

### 2.2 NON-FUNCTIONAL REQUIREMENTS ###

**2.2.1. Operating & Platform constraints**

> 2.2.1.1. The application should be supported by Google Chrome, Safari, Internet Explorer and Mozilla Firefox.

**2.2.2. Modifiability**

> 2.2.2.1. The system should be designed so that the developers can modify it to respond the varying needs of users.

**2.2.3. Portability**

> 2.2.3.1. A mobile application to interact with community shall be supported with less features relative to the web application.

**2.2.4. Security**

> 2.2.4.1. The application shall be accessed via a user authentification process. (i.e. sign in) Only members shall see the contents. Registration shall be validated since it is a restricted community.

**2.2.5. Usability**

> 2.2.5.1. The user interface of the application should be similar to popular social media applications (e.g. Facebook) at the launch stage to achieve ease of use.

> 2.2.5.2. There shall be more visual design to focus on the content.

**2.2.6. Privacy**

> 2.2.6.1. The user shall be able to arrange the visibility of their information, posts etc.

**2.2.7. Language**

> 2.2.7.1. In the early stage, the application shall be in English for everybody including foreigners to understand.

**2.2.8. Response Time**

> 2.2.8.1. Response time of the web pages and database queries should be less than ten seconds with an average quality Internet connection.

**2.2.9. Reliability**

> 2.2.9.1. All the records and database shall be copied for possible failures and the copied data should be updated periodically(daily or after some amount of changes).

**2.2.11. Expected Activity**

> 2.2.11.1. Since the CmpE community is limited in number, user transaction per second will have an upper bound of the number of the people in the department, assuming a user can make one transaction per second.

**2.2.12. System Availability**

> 2.2.12.1. The user interface of the system shall be supported by Google Chrome, Safari, Internet Explorer and Mozilla Firefox.

> 2.2.12.2. The user interface of the system shall be available during day and the maintenance shall be performed at nights when necessary.

**2.2.13. Physical Requirements**

> 2.2.13.1. System shall be written using an IDE in Windows, OS X or Linux operating systems.

> 2.2.13.2. System shall be written by using Ruby on Rails.