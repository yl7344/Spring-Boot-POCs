import React, { useEffect, useState } from 'react';

import axios from "axios"; //exios get async using onchange and onclick to pass data to backend endpoints

const Login = (e: any): JSX.Element => {
	
	const User = {
		id: -1,
		password: ''
	}
	
	const [user, setUser] = useState(User);
	
	const handleOnChange = async (e: any) => {
		const { name, value } = e.target;
		setUser({ ...user, [name]: value });
	}
	
	const handleOnClick = async (e: any) => {
		e.preventDefault();
		
		const path = '/Users/' + User.id; 
		fetch(path)
			.then(response => response.json())
			.then(data => console.log(data.password))
			
		//useNavigate to main page if password equals
	}  
	
	return (
		<div>
			<div className="username">
				<TextField value={User.id}   onChange={handleOnChange} />
			</div>
			
			<div className="password">
				<TextField value={User.password}   onChange={handleOnChange} />
			</div>
		
			<div className="loginButton">
				<Button onClick={handleOnClick}>
			</div>
		</div>
	);
}

export default Login;