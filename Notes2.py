class dealer_automobiles:
    
    def __init__(self):
        self._v_make = ''
        self._v_model = ''
        self._v_color = ''
        self._v_year = 0
        self._v_mileage = 0

    def add_new_vehicle(self):
        try:
            self._v_make = str(input('Enter vehicle make: '))
            self._v_model = str(input('Enter vehicle model: '))
            self._v_color = str(input('Enter vehicle color: '))
            self._v_year = int(input('Enter a 4 digit vehicle model year: '))
            self._v_mileage = int(input('Enter vehicle mileage: '))
            return True
        except ValueError:
            print('Please try entering vehicle information again using only whole numbers for the mileage and year built.')
            return False
    #Function for returning a input vehicle information in a string format, allowing the string to be stored in a human readable format            
    def __str__(self):
        return ' '.join(str(m) for m in [self._v_make.upper(), self._v_model.upper(), self._v_color.upper(), self._v_year, self._v_mileage])

class dealer_inventory():
    def __init__(self):
        self.vehicles = []
    def add_vehicle(self):
        new_vehicle = dealer_automobiles()
        if new_vehicle.add_new_vehicle() == True:
            self.vehicles.append(new_vehicle)
            print('\n Vehicle has been added \n')
    def view_inventory(self):
        print('\n')
        print(' '.join([' ', 'MAKE', 'MODEL', 'COLOR', 'YEAR', 'MILEAGE']))
        for index, vehicle in enumerate(self.vehicles):
            #Shows the index number of the vehicle, starting at 1
            print(f'{index+1}', end=' ')
            print(vehicle)
        print('\n')
            
    def output_text_file(self):
        #Designating filepath for text file to be created
        with open ('C:/Users/Jake/OneDrive/Desktop\Folder/VS Code/vehicle_inventory.txt', 'w') as inventory_file:
            #Adding a header and line-break to the top of the text file
            inventory_file.write('   MAKE MAKE MODEL COLOR MILEAGEe')
            inventory_file.write('\n')
            #Adding all vehicles to the text file
            for vehicle in inventory.vehicles:
                inventory_file.write(f'\n {vehicle}')
            print('File exported')
            
#Variable for dealer_inventory() class
inventory = dealer_inventory()

while True:
    
    #Front facing menu for users to choose their option
    print('Hello, welcome to Assorted Autos!')
    print('Please choose an option below.')
    print('---------------------------------')
    print('A) Add a new vehicle')
    print('U) Update an existing vehicle')
    print('R) Remove an existing vehicle')
    print('D) Display vehicle inventory')
    print('E) Export vehicle inventory')
    #Input given with a .upper() function to account for any lowercase letters   
    user_input = input('Select an Option: ')
    choice = user_input.upper()
    
    if choice == 'A':
        inventory.add_vehicle()
    elif choice == 'U':
        #Checking if there's anything in the inventory
        if len(inventory.vehicles) <= 0:
            print('\n Inventory is empty \n')
        car_index = int(input('Enter the index number of the vehicle to be updated: '))
        #Checking that the car_index doesn't go lower than the lowest index in the list
        if car_index-1 > len(inventory.vehicles):
            print('\n Invalid index number')
        else:
            dealer = dealer_automobiles()
            if dealer.add_new_vehicle() == True:
                inventory.vehicles[car_index-1] = dealer      #does this indexing work properly?
                print('\n Vehicle has been updated \n')
    elif choice == 'R':
        if len(inventory.vehicles) <= 0:
            print('\n Inventory is empty \n')
        car_index = int(input('Enter the index number of the vehicle to be removed: '))
        if car_index-1 > len(inventory.vehicles):
            print('Invalid index number \n')
        else:
            #Using car_index-1 to account for the list headers being in the first index
            inventory.vehicles.remove(inventory.vehicles[car_index-1])
            print('\n Vehicle removed \n')
    elif choice == 'D':
        if len(inventory.vehicles) <= 0:
            print('\n Inventory is empty \n')
        else:
            #Calling the view_inventory function
            inventory.view_inventory()
    elif choice == 'E':
        if len(inventory.vehicles) <= 0:
            print('\n Inventory is empty \n')
        else:
            #Calling the output_text_file function
            inventory.output_text_file()
    
            