class national_homes_for_sale:
    def __init__(self):
        self.state = ''
        self.city = ''
        self.address = ''
        self.year_built = 0
        self.price = 0
        self.sq_ft = 0
        self.num_beds = 0
        self.num_baths = 0
        self.homes_for_sale = []
        
    def add_new_sale_listing(self):
        try:
            self.state = str(input("Enter home's state: "))
            self.city = str(input("Enter home's city: "))
            self.address = str(input("Enter home's address: "))
            self.year_built = int(input("Enter a four digit year the home was built: "))
            self.price = float(input("Enter home's price: "))
            self.sq_ft = int(input("Enter home's square footage: "))
            self.num_beds = int(input("Enter home's number of bedrooms: "))
            self.num_baths = int(input("Enter home's number of bathrooms: "))
            return True
        except ValueError:
            print('Please try entering whole numbers for the square footage, number of bedrooms and number of bathrooms.')
            return False

    def add_home_for_sale(self):
        new_home_for_sale = national_homes_for_sale()
        if new_home_for_sale.add_new_sale_listing() == True:
            self.homes_for_sale.append(new_home_for_sale)
            print('\n Home listing added \n')

class national_homes_for_rent:
    def __init__(self):
        
class national_off_market_homes:
    def __init__(self):
        
sales_inventory = national_homes_for_sale()

while True:
    
    

