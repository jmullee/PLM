# BEGIN TEMPLATE
def caughtSpeeding(speed, isBirthday):
	# BEGIN SOLUTION
	if ((isBirthday and speed <= 65) or (speed <= 60)):
		return 0
	elif ((isBirthday and speed <= 85) or (speed <= 80)):
		return 1
	else:
		return 2

# END SOLUTION
# END TEMPLATE
