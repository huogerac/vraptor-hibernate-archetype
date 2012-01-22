to help you to create vraptor classes, you can use:

1) Creating a entity class (model) and DAO
   mvn vraptor:create-model -Dmodel=[MODEL_NAME]

2) Creating a Controller and JSP
   mvn vraptor:create-controller -Dmodel=[MODEL_NAME] -Dmethod=list