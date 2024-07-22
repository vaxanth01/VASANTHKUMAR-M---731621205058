items = []

def get_input(prompt):
    return input(prompt)

def display_items():
    if items:
        print("Current items in the list:")
        for index, item in enumerate(items, start=1):
            print(f"{index}. {item}")
    else:
        print("The list is currently empty.")

def insert_item():
    item = get_input("Enter the item to insert: ")
    items.append(item)
    print(f"'{item}' has been added to the list.")

def delete_item():
    """Function to delete an item"""
    display_items()
    index = int(get_input("Enter the number of the item to delete: "))
    if 0 < index <= len(items):
        removed_item = items.pop(index - 1)
        print(f"'{removed_item}' has been removed from the list.")
    else:
        print("Invalid index.")

def update_item():
    """Function to update an item"""
    display_items()
    index = int(get_input("Enter the number of the item to update: "))
    if 0 < index <= len(items):
        new_item = get_input("Enter the new value: ")
        old_item = items[index - 1]
        items[index - 1] = new_item
        print(f"'{old_item}' has been updated to '{new_item}'.")
    else:
        print("Invalid index.")

def main():
    """Main function to run the program"""
    while True:
        print("\nMenu:")
        print("1. Display items")
        print("2. Insert item")
        print("3. Delete item")
        print("4. Update item")
        print("5. Exit")
        
        choice = get_input("Enter your choice: ")

        if choice == '1':
            display_items()
        elif choice == '2':
            insert_item()
        elif choice == '3':
            delete_item()
        elif choice == '4':
            update_item()
        elif choice == '5':
            print("Exiting the program.")
            break
        else:
            print("Invalid choice. Please try again.")

if __name__ == "__main__":
    main()
