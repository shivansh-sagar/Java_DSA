n = 5
numSeq = [3, 6, 2, 3, 5]

first_score = 0
second_score = 0

for round_num in range(n):
    picked_number = numSeq.pop(0)  # Remove the first number from the sequence

    if round_num % 2 == 0:  # If it's the first player's turn
        first_score += picked_number
    else:  # If it's the second player's turn
        second_score += picked_number
        if picked_number % 2 == 0:
            numSeq.reverse()

# Calculate the difference in scores
score_difference = first_score - second_score

print("The total difference between players' scores is:", score_difference)