letters = ["A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z"]
points = [1, 3, 3, 2, 1, 4, 2, 4, 1, 8, 5, 1, 3, 4, 1, 3, 10, 1, 1, 1, 1, 4, 4, 8, 4, 10]

letter_to_points = {key:value for key, value in zip(letters, points)}
letter_to_points[" "] = 0

def score_word(word):
    point_total = 0
    
    for letters in word:
        letters = letter_to_points.get(letters, 0)
        point_total += letters
    return point_total

#brownie_points = score_word('BROWNIE')

player_to_words = {'player1': ['BLUE', 'TENNIS', 'EXIT'], 'wordNerd': ['EARTH', 'EYES', 'MACHINE'], 'Lexi Con': ['ERASER', 'BELLY', 'HUSKY'], 'Prof Reader': ['ZAP', 'COMA', 'PERIOD']}
player_to_points = {}

#Iterate through player_to_words, adding up the total points for their words
#Adding the info to player_to_points with player, player_points as key, value

for player in player_to_words.items():
    player_points = 0
    
    for play in player:
        
        for p in play:
            p = score_word(p)
            player_points += p
            
        player_to_points[p] = player_points
        
print(player_to_points)