# Use an official Node.js runtime as a base image
FROM node:18-alpine

# Set the working directory
WORKDIR /app

# Copy the entire application to the container
COPY . .

# Build the production-ready app
RUN npm run build 

# Expose the port on which the app will run
EXPOSE 3000

# Start the apllication
CMD ["npm", "start"]
