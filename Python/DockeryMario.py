def double_pyramid(height):
    result = ""
    for i in range(1, height + 1):
        # Add spaces to the result
        result += " " * (height - i)

        # Add left side of the pyramid to the result
        result += "#" * i

        # Add the gap between the two pyramids to the result
        result += " "

        # Add right side of the pyramid to the result
        result += "#" * i

        # Move to the next line after completing a row
        result += "\n"
    
    return result

# Set the height of the double pyramid
height = int(input("How many lines for the double pyramid? "))

# Print the double pyramid
print(double_pyramid(height))

