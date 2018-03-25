#macro($findByUsername(username))
SELECT * FROM account WHERE name = :username
#end

#macro($findByMobile(mobile))
SELECT * FROM account WHERE mobile = :mobile
#end

#macro($findByEmail(email))
SELECT * FROM account WHERE email = :email
#end