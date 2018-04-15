#macro($findByAccountId(accountId))
SELECT * FROM user WHERE account_id = :accountId
#end