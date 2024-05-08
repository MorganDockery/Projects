def calculate_change(owed):
    quarter_value = 25
    dime_value = 10
    nickel_value = 5
    penny_value = 1

    cents_owed = int(owed * 100)

    change = []

    quarters = cents_owed // quarter_value
    change.append(quarters)

    remaining_cents = cents_owed % quarter_value

    dimes = remaining_cents // dime_value
    change.append(dimes)

    remaining_cents %= dime_value

    nickels = remaining_cents // nickel_value
    change.append(nickels)

    remaining_cents %= nickel_value

    pennies = remaining_cents
    change.append(pennies)

    return change

def print_change(change_list):
    coins = ["Quarter", "Dime", "Nickel", "Penny"]

    for count, coin in zip(change_list, coins):
        if count > 0:
            if count > 1:
                if coin == "Penny":
                    coin = "Pennies"
                else:
                    coin += "s"
            print(f"{count} {coin}")

change_owed = float(input("Change owed: "))

change_list = calculate_change(change_owed)
print_change(change_list)

