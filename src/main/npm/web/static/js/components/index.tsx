import React from 'react';

import "regenerator-runtime/runtime";
import Login from "./Login";

interface Props {
	name: String;
}

export function Index(props: Props): JSX.Element {
	return (
		<div className="loginPage">
			<login/>
		</div>
	);
}