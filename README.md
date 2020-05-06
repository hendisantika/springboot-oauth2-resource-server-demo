# springboot-oauth2-resource-server-demo

Spring Oauth2 ResourceServer + Oauth2 Security + Authorization Code grant flow.

### Overview
On [my github repository](https://github.com/hendisantika/springboot-oauth2-auth-server-demo), we implemented a Spring Oauth2 Authorization server. In this article, we are going to create an Oauth2 resource server implementing Spring Oauth2 and secure its methods using Oauth2. Also, we will test both the Authorization and Resource server using the Authorization code grant flow.
#### What is a Resource server?
Resource server provides protected resources. It communicates with its Authorization server to validate a request to access a protected resource. Typically the endpoints of a resource server are protected based on the oauth2 scopes and user roles.
You can find the code in [My GitHub repository](https://github.com/hendisantika/springboot-oauth2-auth-server-demo).


